package com.jspider.springmvc.controller;

public class Temp {
	static String a = null;
	
	public static void m1() {
		a = "value";
		System.out.println(a);
	}
	public static void m2() {
		System.out.println("after m1 "+a);
	}
	
	public static void main(String[] args) {
		 String s = "hi my name is kuldeep";
		 
		 String arr[] = s.split(" ");
		 
		 for(int i=arr.length-1; i>=0; i--) {
			 System.out.print(arr[i]+" ");
		 }
		 
	}
}
