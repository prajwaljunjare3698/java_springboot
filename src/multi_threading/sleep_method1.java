package multi_threading;

public class sleep_method1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)throws InterruptedException {
		System.out.println("hello");
		
		sleep_method1 t = new sleep_method1();
		
		t.start();
		
		for(int i=1;i<=5;i++) {
			Thread.sleep(300);
			System.out.println(i);
		}
	}
}
