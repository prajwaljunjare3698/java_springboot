package multi_threading;
class simp{
	public void check() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this) {
			try {
				for(int i=1;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+" for-"+i);
					Thread.sleep(400);
				}
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}
public class sync_block2 extends Thread {
	static simp obj;
	public void run() {
		try {
			obj.check();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//create ref of simple clas for calling method
		obj = new simp();
		
		sync_block2 t1 = new sync_block2();
		t1.start();
		t1.setName("first");
		
		sync_block2 t2 = new sync_block2();
		t2.start();
		t2.setName("second");
	}
	
}
