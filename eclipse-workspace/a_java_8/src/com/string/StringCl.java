package com.string;

public class StringCl {
	public static void main(String[] args) {
		String s = "  " ;
		
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		
		System.out.println(s.repeat(4));
		System.out.println(s.strip());
	}
}
