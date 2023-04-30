package multi_threading;
class movie_theatre{
	static int total_seat = 10;
	public synchronized void booking(int seat) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		
		if(seat<=total_seat) {
			total_seat = total_seat-seat;
			System.out.println(seat+" seats booked: left "+total_seat);;
		}
		else{
			System.out.println("there is no seats: left "+total_seat);;
		}
	}
}
public class ticket_book extends Thread {
	static movie_theatre b;
	int seats;
	public void run() {
		try {
			b.booking(seats);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String ar[]) throws InterruptedException {
		b = new movie_theatre();
		
		ticket_book deepak = new ticket_book();
		deepak.seats = 2;
		deepak.start();
		deepak.setName("deepak");
		//deepak.join();
		
		ticket_book amit = new ticket_book();
		amit.seats = 9;
		amit.setName("amit");
		amit.start();
		//amit.join();
		
		//we are getting inconsistent output 
		//thats why java has Synchronization
	}
}
