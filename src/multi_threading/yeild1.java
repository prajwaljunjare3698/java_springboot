package multi_threading;

public class yeild1 extends Thread {
	public void run() {
		//Thread.yield();
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(800);
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		yeild1 t = new yeild1();
		t.start();
		
		//Thread.yield();	//if u want to stop main thread
							// and give chance to another thread
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
