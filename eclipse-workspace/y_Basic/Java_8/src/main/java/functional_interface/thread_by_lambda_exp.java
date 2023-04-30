package functional_interface;

public class thread_by_lambda_exp {
	public static void main(String[] args) {
		Runnable r1 = ()->{		
			System.out.println("runing");
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}
	
}
