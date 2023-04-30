package multi_threading;

public class single_task_multi_thread extends Thread{
	public void run() {
		System.out.println("task1");
	}
	public static void main(String[] args) {
		single_task_multi_thread t1 = new single_task_multi_thread();
		t1.start();	
		
		single_task_multi_thread t2 = new single_task_multi_thread();
		t2.start();
	}
}
