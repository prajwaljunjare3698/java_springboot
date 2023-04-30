package exceptions;

public class Program2 {
	public static void main(String[] args) {
		int a[] = {10,20,30};
		
		System.out.println("Start");
		try
		{
		System.out.println(a[1]);
		System.out.println(a[99]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Index in not present");
		}
		System.out.println("end");
	}

}
