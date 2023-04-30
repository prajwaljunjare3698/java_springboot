package multi_threading;

public class daemon_thread extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		}
		System.out.println("child thread");
	}
	public static void main(String[] args) {
		System.out.println("hello");
		daemon_thread t = new daemon_thread();
		
		t.setDaemon(true);
		t.start();
	}  
}

