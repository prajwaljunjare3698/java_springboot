package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map$FlatMap {
	public static void main(String[] args) {
		List<String>a = new ArrayList<>(List.of("akash","prajwla","abd","shag"));
		List<List<String>>b = new ArrayList<>();
		b.add(List.of("abc","rupa"));
		b.add(List.of("sachin","akshay"));
		b.add(List.of("kedar","kuldep"));
		b.add(List.of("ruhsi","sagar"));
		
		List<Integer> len = a.stream().map(i-> i.length()).collect(Collectors.toList());
		System.out.println(len);
		
		System.out.println(b);
		List<String> collect = b.stream().flatMap(e-> e.parallelStream()).collect(Collectors.toList());
		System.out.println(collect);
		
//		b.stream().flatMap(e-> e.stream().sorted()).collect(Collectors.toList()).forEach(System.out::println);
//		b.stream().flatMap(e-> e.stream().map(i-> i.concat("P"))).collect(Collectors.toList()).forEach(System.out::println);
		List<Integer> collect2 = b.stream().flatMap(e-> e.stream().map(i-> i.length())).collect(Collectors.toList());
		System.out.println(collect2);
		
	}
}