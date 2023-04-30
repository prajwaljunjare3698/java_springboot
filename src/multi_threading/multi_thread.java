package multi_threading;

public class multi_thread {
	public static void main(String[] args) {
		multi_task1 t1 = new multi_task1();
		t1.start();
		
		multi_task2 t2 = new multi_task2();
		t2.start();
	}
}
