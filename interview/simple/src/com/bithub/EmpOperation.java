package com.bithub;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EmpOperation {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
        
		list.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		list.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		list.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		list.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		list.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		list.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		list.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		list.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		list.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		list.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		list.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		list.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		list.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		list.add(new Emp(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
				

//		List<Emp> collect = list.stream().filter(e-> e.getName().length()>5).collect(Collectors.toList());
//		System.out.println(collect);
//
//		List<Integer> a = new ArrayList<>(List.of(100,212,4353,12,65,945,98));
//		a.stream().map(e-> e>100).collect(Collectors.averagingDouble(Integer::intValue));

//		Map<String,List<Emp>> collect = list.stream().collect(Collectors.groupingBy(Emp::getGender));
//		Set<Entry<String, List<Emp>>> entrySet = collect.entrySet();
		
		List<Emp> collect = list.stream().sorted(Comparator.comparing(Emp::getName).thenComparing(Emp::getAge)).collect(Collectors.toList());
		System.out.println(collect);
		
			


	}
}
