package multi_threading;

public class create_thread2 implements Runnable {
	public void run() {
		System.out.println("thread task");
	}
	public void start() {
		System.out.println("start method");
	}
//	public void run(int a) {
//		System.out.println(a);
//	}
	public static void main(String[] args) {
		
		create_thread2 c = new create_thread2();
		
		//extra step
		Thread th = new Thread(c);
		th.start();		//thread created
//		th.run(8);		//error
		th.run();		//thread is not created
	}
}
