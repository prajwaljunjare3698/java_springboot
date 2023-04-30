package shubham;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class arraylist {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(null);
		//System.out.println(s);
		s.pop();
//		System.out.println(s);
//		System.out.println(s.peek());
		
		HashSet h = new HashSet();
		h.add(6);
		h.add(3);
		h.add(6);
		h.add("abc");
		h.remove(6);
		h.remove(3);
		h.add(1);
		System.out.println(h);
	}
}
