package exception_pro;

public class exception_propogation {
	public static void m1() throws ArithmeticException{
		throw new ArithmeticException("devide by zero");
		
	}
	public static void m2() throws ArithmeticException {
		m1();		
	}	
	public static void main(String[] args) {
		
		try {
			m2();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
