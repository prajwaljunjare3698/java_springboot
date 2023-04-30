package com.programs;

import java.util.HashMap;
import java.util.Map;

public class Temp {
	public static void main(String[] args) {
		Map<Integer, String>m = new HashMap<>();
		m.put(1, "a");
		m.put(2, "ab");
		m.put(3, "abc");
		m.put(5, "bc");
		m.put(5, "tc");
		
//		System.out.println(m);
		
		int first = 0;
		int second = 1;
		for(int i=1;i<=10;i++) {
			System.out.println(first);
			
			int third = first + second;
			first = second;
			second = third;
		}
	}
}
