package File_Handling;

public class exception_example {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
	}
}
//e.printStackTrace()
//java.lang.ArithmeticException: / by zero
//at File_Handling.exception_example.main(exception_example.java:6)
//


//print(e)
//java.lang.ArithmeticException: / by zero


//e.getMessage()
//  '/ by zero'