package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(23,11,25,66,32,42));
		
//		a.stream().forEach(System.out::println);
		
//		1st way to square no
//		a.stream().forEach(i->{
//			System.out.println("the square "+(i*i));
//		});
		
//		2nd way to square (Consumer interface(it is functional interface)
		Consumer<Integer> c = i->{
			System.out.println("the squre is "+(i*i));
		};
//		a.stream().forEach(c); 
		
		Integer[] arr = a.stream().toArray(Integer[]::new);
		for(Integer i:arr) {
			System.out.println(i);
		}
		
		
	}
}
