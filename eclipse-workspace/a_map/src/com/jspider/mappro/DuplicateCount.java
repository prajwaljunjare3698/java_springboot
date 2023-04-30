package com.jspider.mappro;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCount {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,2,2,2};
		
		Map<Integer, Integer>m = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(m.containsKey(arr[i])) {
				int count = m.get(arr[i]);
				m.put(arr[i], ++count);
			}
			else {
				m.put(arr[i], 1);
			}
		}
		System.out.println(m);
	}
}
