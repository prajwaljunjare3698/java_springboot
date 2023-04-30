package multi_threading;

public class current_thread1 extends Thread {
	public void run() {
		//everything here done by thread0
		System.out.println("task1: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		//everything in main method done by main thread
		current_thread1 thread1 = new current_thread1();
		System.out.println("hello is printed by "+Thread.currentThread().getName());
		//thread1.setName("first_thread");
		thread1.start();
		
		current_thread1 thread2 = new current_thread1();
		//thread2.setName("second_thread");
		thread2.start();
	}
}
