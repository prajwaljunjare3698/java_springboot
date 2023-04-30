package multi_threading;

public class suspend_resume1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		suspend_resume1 t1 = new suspend_resume1();
		System.out.println(t1.toString());
		suspend_resume1 t2 = new suspend_resume1();
		suspend_resume1 t3 = new suspend_resume1();
		System.out.println(t2.getState());
		t1.start();
		System.out.println(t1.toString());
		t2.start();
		
		System.out.println(t1.getContextClassLoader());
		t2.suspend();	//paused the execution
		t3.start();
		 	
		t2.resume();	//resuem the paused thread
		t2.stop();		//stop the thread
		t2.activeCount();
		System.out.println(t1.activeCount());
		System.out.println(t2.holdsLock(t3));
		t2.dumpStack();
		
	}
}
