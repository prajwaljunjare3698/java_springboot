package exception_pro;

public class finally_block {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		String s = "ab12k5";
		char c[] = s.toCharArray();
		for(char i:c) {
			System.out.println(i);
		}
		String g = new String(c);
		System.out.println(g);
		try {
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("last of try");
		}
		
	}
}
