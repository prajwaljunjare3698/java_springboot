package com.tut;

public class recursion {
	public static void main(String[] args) {
		add(1);
	}
	public static void add(int a) {
		if(a<=10) {
			System.out.println(a);
			
			add(++a);
		}
	}
}
