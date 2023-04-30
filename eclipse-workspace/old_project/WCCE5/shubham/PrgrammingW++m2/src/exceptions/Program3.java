package exceptions;

public class Program3 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Invalid index");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer ");
		}
		catch (Exception e) 
		{
			System.out.println("Super class exception");
		}
		
	}

}
