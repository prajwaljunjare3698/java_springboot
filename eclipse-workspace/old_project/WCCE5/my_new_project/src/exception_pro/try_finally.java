package exception_pro;

public class try_finally {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("end program");		
		try {
			String s = "ab";
			System.out.println(s.charAt(8));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("2nd finally");
		}
	}
	
	
}
