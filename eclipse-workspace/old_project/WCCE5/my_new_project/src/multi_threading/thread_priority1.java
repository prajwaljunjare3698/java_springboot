package multi_threading;
//game taskk priorities
class audio extends Thread {
	public void run() {
		System.out.println("audio");
	}
}
class visual extends Thread{
	public void run() {
		System.out.println("video");
	}
}
class time extends Thread{
	public void run() {
		System.out.println("time is on");
	}
}
class retio extends Thread{
	public void run() {
		System.out.println("retio");
	}
}
public class thread_priority1{
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getPriority());
		System.out.println("hi");
		Thread.currentThread().setPriority(9);
		audio t1 = new audio();
		t1.setPriority(2);;
		//t1.setDaemon(true);
		t1.start();
		
		visual t2 = new visual();
		t2.setPriority(7);
		t2.start();
		
		time t3 = new time();
		t3.setPriority(3);
		t3.start();
		
		retio t4 = new retio();
		t4.setPriority(5);
		t4.start();
		
		t3.setPriority(6);
		
		
		
		
		
	}
}