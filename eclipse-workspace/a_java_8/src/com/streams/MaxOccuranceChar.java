package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxOccuranceChar {
	static float f;
	public static void main(String[] args) {
		String s = "asggggggvsaasdsdaa";
		
//		long count = s.chars().filter(i-> i=='a').count();
		
		List<Integer> a = new ArrayList<>(List.of(4,5,6,3,2,46,7,40));
		
		Integer findFirst = a.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(findFirst);		
		int first = 0;
		
		char c = 0;
		for(int i=0;i<s.length();i++) {
			int count = 0;
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>first) {
				first = count;
				c = s.charAt(i);
			}
		}
		System.out.println(c);
	}
}
