package multi_threading;

public class set_name extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("again_changed");
		System.out.println(Thread.currentThread().getName());
		System.out.println("task");
	}
	public void demo() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());
		
		set_name thread1 = new set_name();
		thread1.start();
		//changing the thread1 name
		thread1.setName("second");
				
		thread1.demo();
	}
}
