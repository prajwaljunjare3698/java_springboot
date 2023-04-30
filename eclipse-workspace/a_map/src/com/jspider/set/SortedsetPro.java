package com.jspider.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedsetPro {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i=1;i<=10;i++) {
			t.add(i);
		}
		System.out.println(t);
		
		SortedSet<Integer> s1 = t.subSet(4, 8);
		TreeSet<Integer> t1 = new TreeSet<Integer>(s1);
		System.out.println(t1); 	//4,5,6,7
		
		SortedSet<Integer> s2 = t.headSet(4);
		TreeSet<Integer> t2 = new TreeSet<>(s2);
		System.out.println(t2); 	//1,2,3
		
		SortedSet<Integer> s3 = t.tailSet(4);
		TreeSet<Integer> t3 = new TreeSet<>(s3);
		System.out.println(t3); 	//4,5,6,7,8,9,10
		
		SortedSet<Integer> s4 = t.descendingSet();
		TreeSet<Integer> t4 = new TreeSet<>(s4);
		System.out.println(t4); 	//10,9,8,7,6,5,4,3,2,1
	}
}
