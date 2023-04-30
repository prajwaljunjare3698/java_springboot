package shubham;

import java.io.Console;

public class console_class {
	public static void main(String[] args) {
		Console obj = System.console();
		System.out.println("enter username");
		String uname = obj.readLine();
		
		System.out.println("enter pass");
		char[] pass = obj.readPassword();
		
		System.out.println("username "+uname+"\n pass is ");
	}
}
