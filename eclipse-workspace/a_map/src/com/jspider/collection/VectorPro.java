package com.jspider.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorPro {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		//System.out.println(v);
		ArrayList<Integer> a = new ArrayList<Integer>(v);
		a.add(11);
		a.add(22);
		//System.out.println(a);
		
//		Iterator<Integer> itr = v.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			Integer t = itr.next();
//			System.out.println(t);
//		}
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
		}
	}
}
