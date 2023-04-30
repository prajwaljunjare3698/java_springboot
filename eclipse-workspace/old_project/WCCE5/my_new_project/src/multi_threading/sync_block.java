package multi_threading;
class mv{
	static int total_seat = 10;
	public void book(int seat)throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this) {
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
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}
public class sync_block extends Thread {
	int seat=0;
	static mv m;
	public void run() {
		try {
			m.book(seat);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		m = new mv();
		synchronized_method deepak = new synchronized_method();
		deepak.seat = 2;
		deepak.start();
		//deepak.setName("deepak");
		
		synchronized_method amit = new synchronized_method();
		amit.seat = 5;
		amit.start();
		//amit.setName("amit");		
	}
}
