package com.streams.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class First {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(List.of(2,3,1,3,4,5,6));
		List<Integer> collect = a.parallelStream().map(i-> i*3).collect(Collectors.toList());
		System.out.println(collect);
		
//		Inner obj = new Inner() {
//			public void m1() {
//				System.out.println("override");
//			}
//		};
//		obj.m1();
		
		
		Inner obj = ()-> System.out.println("override");			
		obj.m1();
	}
	interface Inner{
		void m1();
	}
}
