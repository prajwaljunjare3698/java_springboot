package executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {
	public static void main(String[] args) {
		Task t1 = new Task();
		Task t2 = new Task();
		
			
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(t1);
		executorService.execute(t2);
		executorService.submit(t2);
		
		executorService.shutdown();
	}
}
