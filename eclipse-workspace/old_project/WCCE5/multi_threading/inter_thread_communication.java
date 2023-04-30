package multi_threading;
class total_earning extends Thread{
	int total = 0;
	public void run() {
		synchronized(this) {
			for(int i=1;i<=500;i++) {
				total+=100;
			}
			this.notify();
		}
	}
}
public class inter_thread_communication {
	public static void main(String[] args) throws InterruptedException {
		total_earning t = new total_earning();
		t.start();
		//using sync wait() to wait for execution of thread
		synchronized(t) {
			t.wait();
			//t.wait(300) if thread is not execute in provided time
						 //it will go further next..args.
		}
		//t.wait(); //cant use wait outside sync 
					//w'll get IllegalMonitorStateException
		System.out.println(t.total);
	}
}
