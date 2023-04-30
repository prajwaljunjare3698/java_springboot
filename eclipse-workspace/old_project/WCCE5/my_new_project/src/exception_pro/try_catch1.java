package exception_pro;

public class try_catch1 {
	public static void main(String[] args) {
		String s = "ab";
		try{
			System.out.println(s.charAt(0));
			int a = 2/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("parent");
		}
		
	}
}
