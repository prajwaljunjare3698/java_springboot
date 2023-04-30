package multi_threading;

public class current_thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); 	//name of current thread
		
		//change name of current thread
		Thread.currentThread().setName("Developer");
		System.out.println("new nameof thread is"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		
		System.out.println(10/0); 	//exception in thread "developer"
	}
}
