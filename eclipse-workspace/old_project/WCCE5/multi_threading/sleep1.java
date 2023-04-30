package multi_threading;

public class sleep1 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" "+Thread.currentThread().getName());
				Thread.sleep(700);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		sleep1 t1 = new sleep1();
		t1.start();
		
		sleep1 t2 = new sleep1();
		t2.start();
		
		//both exceute alternatively
	}
}
