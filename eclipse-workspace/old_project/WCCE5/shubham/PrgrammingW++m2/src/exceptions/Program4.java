package exceptions;

public class Program4 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		}
		
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("----------");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Super class exception");
		}
		
		// best practice to write super class exception
		//at the last
	}

}
