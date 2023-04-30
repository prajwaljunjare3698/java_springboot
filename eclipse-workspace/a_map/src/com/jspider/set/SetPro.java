package com.jspider.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPro {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(3);
		h.add(1);
		h.add(9);
		h.add(2);
		h.add(-4);
		h.add(null);
		h.add(null);
		
		System.out.println(h);	//insertion order is not mainted
		Iterator<Integer> itr = h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedHashSet<Integer> l = new LinkedHashSet<>();
		l.add(5);
		l.add(2);
		l.add(null);
		l.add(9);
		l.add(1);
		l.add(4);
		System.out.println(l);	//inserttion order is mainted
		
		TreeSet<Integer> t = new TreeSet<>();
		t.add(5);
		t.add(2);
		t.add(9);
		t.add(1);
		
		System.out.println(0); 	//inserted in ascending order
	}
}
