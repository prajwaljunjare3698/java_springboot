package com.bithub;

public class IncremntNo {
	public static void main(String[] args) {
		String no = "1234";
		int n = 1234;
		int rev = 0;
		
		for(int i=0;i<no.length();i++) {
			int dig = Integer.parseInt(Character.toString(no.charAt(i)));
			rev = rev*10 + ++dig;
		}
		System.out.println(rev);
	}
}
