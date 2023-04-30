package com.jspider.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class ArrayListPro {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(2);
		a.add(3);
		a.add(23);
		a.add("abc");
		
		a.remove("abd");//nothing will deleted...
		
		a.set(0, "first");
		a.set(2, null);
		
		System.out.println(a);;
		
		ArrayList b = new ArrayList();
		b.add(11);
		b.add(12);
		b.add("asdfj");
		
		//b.add(a);
//		b.addAll(a);
		b.addAll(3, a);
		
		System.out.println(b);
		System.out.println(b.containsAll(a));
		
		Collections.swap(a, 0, 3);
		System.out.println(a);
		
		ArrayList c = new ArrayList(b.subList(1, 3));
		System.out.println(c);
		
		
//		Iterator itr = a.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	
}
