package multi_threading;

public class thread_priority extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("task");
		
	}
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getPriority()); //5
		
		thread_priority t = new thread_priority();
		System.out.println(t.getPriority()); //same as main thread priority 5
		
		t.setPriority(8);
		t.start();
	}
}
