package com.array;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int arr1[] = {1,2,4};
		int arr2[] = arr1;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int arr3[] = Arrays.copyOf(arr1,4);
		System.out.println(Arrays.toString(arr3));	//1,2,3,0
		
		int arr4[] = arr1.clone();
		System.out.println(Arrays.toString(arr4));
	}
}
