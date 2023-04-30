package executer.framework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("after time");
	}
}
class Task2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("after time");
	}
}
public class ScheduleExecuter {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		service.schedule(t1, 5, TimeUnit.SECONDS);
		service.schedule(t2, 5, TimeUnit.SECONDS);
		service.shutdown();
		System.out.println(1/0.0);
	}
}
