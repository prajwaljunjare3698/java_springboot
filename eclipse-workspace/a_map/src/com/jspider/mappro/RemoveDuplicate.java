package com.jspider.mappro;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1,23,4};
	
		Set<Integer> s = new LinkedHashSet<>();

		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
	}
}