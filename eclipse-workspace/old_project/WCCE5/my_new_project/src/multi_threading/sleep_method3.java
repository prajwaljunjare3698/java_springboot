package multi_threading;

public class sleep_method3 extends Thread {
	public void run() {
		//cant throws exception
		//cause overriden method does not throws exception
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i);
				Thread.sleep(200);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	public static void main(String[] args) {
		sleep_method3 t = new sleep_method3();
		t.start();
	}
}
