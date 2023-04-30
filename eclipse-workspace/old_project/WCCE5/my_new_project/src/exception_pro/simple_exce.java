package exception_pro;

import java.security.PublicKey;

public class simple_exce {
	public static void main(String[] args) {
	
		try {
			System.out.println(1/0);
		}
		catch(Exception e) {
			e.printStackTrace();
//			System.out.println(e);//print only exname and msg
//			System.out.println(e.toString());//print only exname and msg
			//System.out.println(e.getMessage());//print only msg
		}
	}
}
