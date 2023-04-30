package rececondition;

class Test extends Thread {
	int bal = 100;
	Race c= new Race();
	public void run() {
		synchronized (c) {
			for (int i = 1; i <= 4; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}
	}
//	public synchronized void check() {
//		for (int i = 1; i <= 4; i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
}

public class Race {
	public static void main(String[] args) throws InterruptedException {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
