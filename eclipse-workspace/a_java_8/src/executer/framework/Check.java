package executer.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class T1 extends Thread{
	public void run() {
		System.out.println("t1 running");
	}
}
class T2 extends Thread{
	public void run() {
		System.out.println("t2 running");
	}
}
class T3 extends Thread{
	public void run() {
		System.out.println("t3 running");
	}
}
class T4 extends Thread{
	public void run() {
		System.out.println("t4 running");
	}
}
public class Check {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new T1());
		service.execute(new T2());// can call as many time as we want
		service.execute(new T3());
		service.execute(new T4());
		for(int i=1;i<=10;i++) {
			service.execute(new T1());
		}
		service.execute(new T4());
		System.out.println("ssss");
		System.out.println("ssss");
		System.out.println("ssss");
		System.out.println("ssss");
		service.shutdown();
	}
}
