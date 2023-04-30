package multi_threading;

public class sleep2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i);
				Thread.sleep(400);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)throws InterruptedException {
		sleep2 t = new sleep2();		
		t.start();
		System.out.println("go to run");
		//t.join();
		for(int i=1;i<=5;i++) {
			Thread.sleep(400);
			System.out.println("main");
		}
	}
}
