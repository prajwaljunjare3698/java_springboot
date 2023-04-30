package exception_pro;

public class try_catch {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
				
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("brobr tak n bhava");
		}
		System.out.println("end program");
		
	}
}
