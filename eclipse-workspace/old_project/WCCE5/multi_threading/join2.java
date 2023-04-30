package multi_threading;

public class join2 extends Thread {
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(400);
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		join2 t = new join2();
		
		t.start();		
		for(int i=1;i<=5;i++) {
			try {
				t.join();	//first all excecute all run then come here
				Thread.sleep(400);
				System.out.println(Thread.currentThread().getName());
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
