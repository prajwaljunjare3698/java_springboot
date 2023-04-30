package multi_threading;

public class sleep_method2 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i);
				Thread.sleep(300);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		sleep_method2 t = new sleep_method2();
		t.start();
		System.out.println("hello");
	}
}
