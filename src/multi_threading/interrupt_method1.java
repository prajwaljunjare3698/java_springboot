package multi_threading;

public class interrupt_method1 extends Thread{
	public void run() {
		try {
			//Thread.currentThread().interrupted();
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(400);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		interrupt_method1 t = new interrupt_method1();
		System.out.println(Thread.currentThread().getName());
		t.start();	
		t.interrupt();
	}
}
