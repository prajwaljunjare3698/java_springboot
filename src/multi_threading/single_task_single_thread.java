package multi_threading;

public class single_task_single_thread extends Thread {
	public void run() {
		System.out.println("task");
	}
	public static void main(String[] args) {
		single_task_single_thread obj = new single_task_single_thread();
		obj.start();	//thread is created
		obj.run();		//if only call run method thread is not created
	}
}
