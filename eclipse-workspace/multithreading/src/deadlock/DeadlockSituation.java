package deadlock;

public class DeadlockSituation {
	String s1 = "prajwal", s2 = "abc";
	
	Thread t1 = new Thread() {
		public void run() {
			synchronized (s1) {
				System.out.println("s1 "+Thread.currentThread().getName());
				synchronized (s2) {
					System.out.println("s2 "+Thread.currentThread().getName());
				}
			}
		}
	};
	Thread t2 = new Thread() {
		public void run() {
			synchronized (s2) {
				System.out.println("s2 "+Thread.currentThread().getName());
				synchronized (s1) {
					System.out.println("s1 "+Thread.currentThread().getName());
				}
			}
		}
	};
	
	public static void main(String[] args) {
		DeadlockSituation obj = new DeadlockSituation();
		obj.t1.start();
		obj.t2.start();
	}
}
