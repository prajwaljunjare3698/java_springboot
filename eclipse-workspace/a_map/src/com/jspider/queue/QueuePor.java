package com.jspider.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class QueuePor {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(2);
		Integer element = q.element();
		System.out.println(element);
		q.add(5);
		q.add(1);
//		q.add(null);
		q.add(8);
		q.add(8);
		System.out.println(q);
		
		Queue<Integer> a = new ArrayDeque<>();
		a.add(3);
		a.add(3);
//		a.add(null);
		a.add(2);
		a.add(5);
		System.out.println(a);
		
		List<Integer> even = a.stream().filter(i->i%2==0).collect(Collectors.toList());
		long count = a.stream().count();
		List<Integer> add = a.stream().map(i->i+4).collect(Collectors.toList());
		Integer reduce = a.stream().filter(i->i%2==0).reduce(0,(ans,i)->ans+i);
		List<Integer> sorted = a.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sorted);
		System.out.println(reduce);
		System.out.println(add); 
		System.out.println(count);
		System.out.println(even);
		
//		Queue<Integer> l = new LinkedList<Integer>();
//		l.add(8);
//		l.add(4);
//		l.add(3);
//		l.add(null);
//		System.out.println(l);
		
		
	}
}
