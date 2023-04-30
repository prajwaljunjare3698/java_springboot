package multi_threading;
class simple{
	public void check() throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				Thread.sleep(600);
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}
public class sync_block1 extends Thread {
	static simple s;
	public void run() {
		try {
			s.check();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		s = new simple();
		
		sync_block1 t1 = new sync_block1();
		t1.start();
		
		sync_block1 t2 = new sync_block1();
		t2.start();
	}
}
