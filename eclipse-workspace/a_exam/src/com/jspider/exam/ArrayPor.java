package com.jspider.exam;

import java.util.Scanner;

public class ArrayPor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		int first = sc.nextInt();
		int last = sc.nextInt();
		int sum = sum(arr,first,last);
		System.out.println(sum);

	}
	public static int sum(int arr[],int first,int last) {
		int sum = 0;
		if(first<0 && last<0) {
			return -1;
		}
		if(first<last) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=first && arr[i]<=last) {
					sum = sum+arr[i];
				}
			}
			if(sum==0) {
				return 0;
			}
			return sum;
		}
		return 0;
		
	}
}
