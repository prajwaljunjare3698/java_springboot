package com.jspider.exam;

public class MissingNo {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		
		//len 5
		
		int len = arr.length+1;
		
		int total = len*(len+1)/2;
		
		for(int i=0;i<arr.length;i++) {
			
			total = total - arr[i];
		}
		System.out.println(total);
	}
}
