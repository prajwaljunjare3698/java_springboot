package multi_threading;

public class join3 extends Thread{
	static Thread m1;
	public void run() {
		try {
			m1.join();
			for(int i=1;i<=5;i++) {
				Thread.sleep(400);
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args)throws InterruptedException {
		//creating ref for main thread
		m1 = Thread.currentThread();
		
		join3 t = new join3();
		t.start();
		
		for(int i=1;i<=5;i++) {
			try {
				//t.join();	execute run then come here
				Thread.sleep(400);
				System.out.println(Thread.currentThread().getName()+i);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
