package multi_threading;

public class even_odd extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			synchronized(this) {
				if(i%2==0 && Thread.currentThread().getName().equals("even")) {
					System.out.println("even "+Thread.currentThread().getName()+" "+i);
				}
				if(i%2==1 && Thread.currentThread().getName().equals("odd")) {
					System.out.println("odd "+Thread.currentThread().getName()+" "+i);
				}
				try {
					Thread.currentThread().wait();
					Thread.currentThread().notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		even_odd t1 = new even_odd();		
		t1.start();
		t1.setName("even");
		
		even_odd t2 = new even_odd();
		t2.start();
		t2.setName("odd");
	}
}
