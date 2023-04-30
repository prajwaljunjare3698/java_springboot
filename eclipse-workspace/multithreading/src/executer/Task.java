package executer;

public class Task extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
