package multi_threading;

public class create_thread extends Thread {
	public void run() {
		System.out.println("thread task");
	}
	public static void main(String[] args) {
		create_thread c = new create_thread();
		c.run();		//thread is not created
		c.start();		//thread is created
		
		//c.start();		//can't start thread again (life of thread like human)
	}
}

