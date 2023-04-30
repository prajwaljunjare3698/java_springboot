package com.jspider.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(4);
		l.add(2);
		l.addFirst(9);
		l.addLast(10);
		l.add(2, 1);
		System.out.println(l);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Integer i = itr.next();
			//System.out.println(i);
		}
		Collections.sort(l);
		System.out.println(l);
		
	}
}
