package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(2,3,4,5,67,6,null,7,8));
		
		List<Integer> even = a.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> odd = a.stream().filter(i->i%2==1).collect(Collectors.toList());
		System.out.println(odd);
		
		List<Integer> add = a.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(add);
	}
}
