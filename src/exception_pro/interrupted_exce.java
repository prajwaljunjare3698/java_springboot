package exception_pro;

public class interrupted_exce 
{
	public static void main(String[] args){
		String a = "abc";
		System.out.println("hii");
		try 
		{			
			System.out.println(a.charAt(3));
		}
		catch(Exception r) 
		{
			System.out.println(r);
		}
		System.out.println("end of program");				
	}
}
