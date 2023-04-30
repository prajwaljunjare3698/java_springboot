package com.streams;

public class Recursion {
	static String s = "prajwal";
	static String s1 = "";
	public static void main(String[] args) {
		int i = s1.length();
		if(s1.length()<s.length()) {
			s1 = s.charAt(i) + s1;
			main(null);
		}
		else {
			System.out.println(s1);
		}
	}
}
