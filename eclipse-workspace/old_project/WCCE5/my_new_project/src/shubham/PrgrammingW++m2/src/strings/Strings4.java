package strings;

import java.util.Scanner;

public class Strings4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = s.next();
		String s2="";
		// without built in 
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		// with built in
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());
	}

}
