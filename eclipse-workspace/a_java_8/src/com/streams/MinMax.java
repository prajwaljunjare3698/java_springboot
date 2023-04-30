package com.streams;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMax {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(23,11,25,66,32,42));
		
		Integer min = a.stream().min((i1,i2)-> i1.compareTo(i2)).get();
//		System.out.println(min);
		
		Integer max = a.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println(max);
		
		
	}
}
