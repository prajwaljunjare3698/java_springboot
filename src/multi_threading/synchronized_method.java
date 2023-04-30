package multi_threading;
class movie{
	static int total_seat = 10;
	public void book(int seat)throws InterruptedException {
		
		if(seat<=total_seat) {
			total_seat = total_seat-seat;
			System.out.println(Thread.currentThread().getName()+" "+seat+" seat book ,left: "+total_seat);
		}
		else {
			if(total_seat==0) {
				System.out.println("sorry all seats booked");
			}
			else {
				System.out.println(Thread.currentThread().getName()+" "+seat+" full left "+total_seat);
			}
		}
		
	}
}
public class synchronized_method extends Thread {
	int seat;
	static movie m;
	public void run() {
		try {
			m.book(seat);
		} catch (InterruptedException e) {
			System.out.println(e);;
		}
	}
	public static void main(String[] args) {
		m = new movie();
		synchronized_method deepak = new synchronized_method();
		deepak.seat = 3;
		deepak.start();
		//deepak.setName("deepak");
		
		synchronized_method amit = new synchronized_method();
		amit.seat = 9;
		amit.start();
		//amit.setName("amit");
		
	}
}
