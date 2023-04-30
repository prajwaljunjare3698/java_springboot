package exceptions;

public class Program5 {
	public static void main(String[] args) {
		int a [] = {10,20,30};
		try 
		{
	      System.out.println(a[1000]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
	   finally 
	   {
		System.out.println("Finally is excuting");
    	}
	}

}
