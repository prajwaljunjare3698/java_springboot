package com.string;


public class Buffer {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("prajwal");
		StringBuffer s2 = new StringBuffer("prajwal");
		
		String s = "prajwal";
		
		System.out.println(s.equals(s1));
		System.out.println(s.contentEquals(s1));
	}
}
