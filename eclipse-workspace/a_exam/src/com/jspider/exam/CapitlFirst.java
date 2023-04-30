package com.jspider.exam;

public class CapitlFirst {
	public static void main(String[] args) {
		String s = "PRAJWAL jUnjaRe sldkfj9pqwijOSDF ADLSKFJA";
		
//		String user= makeIt(s);
//		System.out.println(user);
		
		secondWay(s);
	}

	private static void secondWay(String s) {
		String first = "";
		for(int i=0;i<s.length();i++) {
			int a = s.charAt(i);
			if(a>=97 && a<=122) {
				char c = (char)a;
				
			}
		}
		
	}




	public static String makeIt(String s) {
		
		String arr[] = s.split(" ");
		
		String first = ""+arr[0].charAt(0);
		first = first.toUpperCase();
		first = first+arr[0].substring(1, arr[0].length()).toLowerCase();
		
		String second = ""+arr[1].charAt(0);
		second = second.toUpperCase();
		second = second+arr[1].substring(1, arr[1].length()).toLowerCase();
		
		return first+" "+second;
	}
}
