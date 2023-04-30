package multi_threading;

public class is_Alive extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("task");
	}
	public static void main(String[] args) {
		is_Alive t1 = new is_Alive();
		t1.start();
		
		t1.setName("t1_thread");
		System.out.println(t1.isAlive());
		System.out.println(Thread.currentThread().getName());
	}
}
