package deadlock;

public class DeadlockHandle {
	String s1 = "prajwal", s2 = "abc";
	
	Thread t1 = new Thread() {
		public void run() {
			synchronized (s1) {
				System.out.println("s1 "+Thread.currentThread().getName());
			}
			synchronized (s2) {
				System.out.println("s2 "+Thread.currentThread().getName());
			}
		}
	};
	Thread t2 = new Thread() { 
		public void run() {
			synchronized (s2) {
				System.out.println("s2 "+Thread.currentThread().getName());
			}
			synchronized (s1) {
				System.out.println("s1 "+Thread.currentThread().getName());
			}
		}
	};	
	public static void main(String[] args) throws InterruptedException {
		DeadlockHandle obj = new DeadlockHandle();
		obj.t1.start();
		obj.t1.join();
		obj.t2.start();
	}
}
