package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	int i;
	String name;
	double sal;
	public Employee(int i, String name, double sal) {
		super();
		this.i = i;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [i=" + i + ", name=" + name + ", sal=" + sal + "]";
	}
}
public class PracticeAll {
	public static void main(String[] args) {
//		ArrayList<Employee>a = new ArrayList<>();
//		a.add(new Employee(1, "ruahi", 1200));
//		a.add(new Employee(2, "partu", 2200));
//		a.add(new Employee(3, "kuld", 3200));
//		a.add(new Employee(4, "ishu", 4200));
//		
//		Predicate<Employee> p = i-> i.sal>2000;
//		
//		for(Employee e:a) {
//			if(p.test(e)) {
//				System.out.println(e.name);
//			}
//		}
//		ArrayList<Integer> a = new ArrayList<>(List.of(12,1,3,22,56,21));
		ArrayList<String> s = new ArrayList<>(List.of("a","ads","bd","tdsd","za"));
//		a.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);
//		List<Integer> collect = a.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
//		System.out.println(collect);
//		s.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList()).forEach(System.out::println);
		
//		Comparator<String> c = (i1,i2)->{
//			int n1 = i1.length();
//			int n2 = i2.length();
//			if(n1>n2) return 1;
//			else if(n1<n2) return -1;
//			else if(n1==n2) return 0;
//			else return i1.compareTo(i2);
//		};
//		s.stream().sorted(c).collect(Collectors.toList()).forEach(System.out::println);
//	    Object[] arr = s.stream().toArray();
//		System.out.println(Arrays.toString(arr));
		
		String str = null;
//		System.out.println(str.charAt(2));
//		Optional<String> op = Optional.ofNullable(str);
//		if(str.nu) {
//			System.out.println("yes");
//		}
	}
}
