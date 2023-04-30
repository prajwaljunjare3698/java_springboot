package multi_threading;

public class sleep_method {
	public static void main(String[] args) throws Exception {
		for(int i=1;i<=5;i++) {
			Thread.sleep(200);
			System.out.println(i);
		}
	}
}
