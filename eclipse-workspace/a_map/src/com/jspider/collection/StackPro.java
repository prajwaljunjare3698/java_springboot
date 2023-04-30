package com.jspider.collection;

import java.util.Stack;

public class StackPro {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(8);
		//s.pop();
		
		//System.out.println(s.peek());
		System.out.println(s.search(1));	//4 cause FILO
		System.out.println(s.search(8));
	}
}
