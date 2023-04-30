package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringAscen {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>(Arrays.asList("anuskha","sunny","priti","kaajal"));
		
		List<String> asc = l.stream().sorted().collect(Collectors.toList());
//		System.out.println(asc);
		
//		print name in increasing length wise
		
		Comparator<String> c = (s1,s2)->{
					int l1 = s1.length();
					int l2 = s2.length();
					if(l1 < l2) return -1;
					else if(l1 > l2) return +1;
					else return s1.compareTo(s2);
		};
		List<String> inclegth = l.stream().sorted(c).collect(Collectors.toList());
//		System.out.println(inclegth);
		
	}
}
