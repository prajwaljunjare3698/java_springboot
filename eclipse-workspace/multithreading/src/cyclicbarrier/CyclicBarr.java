package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task implements Runnable{
	CyclicBarrier barrier;
	public Task(CyclicBarrier barrier){
		this.barrier = barrier;
	}
	public void run() {
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
public class CyclicBarr {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		CyclicBarrier obj = new CyclicBarrier(3);
		
		service.submit(new Task(obj),1);
		service.submit(new Task(obj),2);
		service.submit(new Task(obj),3);
		System.out.println("work");
	}
}
