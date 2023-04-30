package multi_threading;

public class join1 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+""+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		join1 t = new join1();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}
