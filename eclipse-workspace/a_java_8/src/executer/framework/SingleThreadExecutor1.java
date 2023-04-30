package executer.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	public void run() {
		System.out.println("task1 is running");
	}
}
public class SingleThreadExecutor1 {
	public static void main(String[] args) {
//		ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new Task());
		service.execute(new Task());
		
		service.shutdown();
	}
}
