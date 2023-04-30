package com.bithub;

import java.util.Arrays;

public class Multiple5 {
	public static void main(String[] args) {
		int arr[] = {3,4,6,3,5,15,43,85,90,21,35,76};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0) {
				int temp = arr[i];
				for(int j=i;j<arr.length-1;j++) {
					arr[j] = arr[j+1];
				}	
				arr[arr.length-1]=temp;
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
