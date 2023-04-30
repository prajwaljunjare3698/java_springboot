package com.jspider.exam;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		
		reverseString();
		anagram();
		missing();		
	}

	private static void reverseString() {
		String s1 = "parmar";
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
			
			s2 = s1.charAt(i)+ s2;
		}
		System.out.println(s2);
	}
	
	public static void anagram() {
		String s1 = "mary";
		String s2 = "army";
		
		char c1[] = s1.toCharArray(); //[m,a,r,y]
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);		//[a,m,r,y]
		Arrays.sort(c2);		
		if(Arrays.equals(c1, c2)) {
			System.out.println("anagram");
		} 
		else {
			System.out.println("not");
		}
	}
	public static void missing() {
		//print all no between elements
		
		int arr[] = {1,2,6,7,11,33};
		int temp = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			temp = arr[i]+1;
			
			for(int j=temp;j!=arr[i+1];j++) {
				
				System.out.println(j);
				
			}							
		}
	}
}

