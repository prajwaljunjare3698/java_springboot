package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNo {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(List.of(1,2,3,2,1,2,3,4,5));
		
		List<Integer> uniq = a.stream().distinct().collect(Collectors.toList());
		System.out.println(uniq);
	}
}
