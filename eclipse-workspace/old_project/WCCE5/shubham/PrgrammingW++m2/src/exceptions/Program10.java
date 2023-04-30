package exceptions;

public class Program10 {
	static void display() throws InterruptedException
	{
		for(int i =1;i<=5;i++) 
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
	public static void main(String[] args) {
		
		try
		{
		display();
		}
		catch (InterruptedException e) 
		{
		 e.printStackTrace();
		}
	}

}
