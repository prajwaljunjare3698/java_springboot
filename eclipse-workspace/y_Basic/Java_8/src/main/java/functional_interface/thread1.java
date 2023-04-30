package functional_interface;

public class thread1 {
	public static void main(String[] args){
		Runnable r1 = () -> {
			for(int i=1;i<=5;i++) {
				System.out.println("running-1"); 
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = () -> {
			for(int i=1;i<=5;i++) {
				System.out.println("running-2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
}
