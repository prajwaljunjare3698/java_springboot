package com.jspider.jsp;

public class Palindrome {
	public static void main(String[] args) {
//		String s = "madam";
//		String s1 = "";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			s1 = s1 + s.charAt(i);
//		}
//		if(s.equals(s1)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//		
		String s1 = "abc";	//contant pool
		String s2 = new String("abc");	//constant pool + heap area
		
		System.out.println(s1.equals(s2));
	}
}
