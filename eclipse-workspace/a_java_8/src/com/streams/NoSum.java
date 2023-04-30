package com.streams;

import java.util.List;
import java.util.stream.Collectors;

public class NoSum {
	public static void main(String[] args) {
		List<Integer>list = List.of(2,3,4,5,6,7);
		
//		Integer sum = list.stream().reduce((a,b)->a+b).get();
//		System.out.println(sum);
		
		Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
		
	}
}
