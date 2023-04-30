package multi_threading;

public class sleep_method4 extends Thread {
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000,-1);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		sleep_method4 t = new sleep_method4();
		
		t.start();
	}
}
