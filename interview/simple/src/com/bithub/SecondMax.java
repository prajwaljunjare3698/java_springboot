package com.bithub;

public class SecondMax {
	public static void main(String[] args) {
		//find even position 2nd max
		int arr[] = {16,43,5,22,34,98};
		int max = arr[0];
		int second = 0;
//		for(int i=0;i<arr.length;i=i+2) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				second = max;
				max = arr[i];
			}
			if(second<max && second>arr[i]) {
				second = arr[i];
			}
		}
		System.out.println(max+" "+second);
	}
}
 