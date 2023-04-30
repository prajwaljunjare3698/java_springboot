package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(24,35,46,25,96,57));
		
//		filter()
		List<Integer> even = a.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(even);
		List<Integer> odd = a.stream().filter(i->i%2==1).collect(Collectors.toList());
//		System.out.println(odd);
		
//		map()	process of every object to result new object
		List<Integer> added = a.stream().map(i->i+5).collect(Collectors.toList());
//		System.out.println(added);
		
//		count() count how many object in the stream
		long count = a.stream().filter(i->i>=30).count();
//		System.out.println(count);
		
//		sorted() sort the objects
		List<Integer> sorted = a.stream().sorted().collect(Collectors.toList());
//		System.out.println(sorted);
		
//		sorted() descending order 1st way(conditional opertor)
		List<Integer> desc1 = a.stream().sorted((i1,i2)-> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
//		System.out.println(desc1);
		
//		List<Integer> desc2 = a.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		List<Integer> desc2 = a.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println(desc2);
		
//		reduce() (eq.find the even no and add them)
		Integer reduce = a.stream().filter(i->i%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(reduce);
	}
}
