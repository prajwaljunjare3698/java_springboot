package com.streams;

import java.util.Arrays;

public class SplitMethod {
	public static void main(String[] args) {
		String s = "this is string";
		String arr[] = s.split(" ");
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		String first = String.valueOf(arr[0].charAt(0)).toUpperCase()+arr[0].substring(1,arr[0].length()).toLowerCase();
		
		System.out.println(first);
	}
}
