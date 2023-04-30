package com.jspider.singleton.lazyclass;

public class SingletonLazy {
	static SingletonLazy obj = new SingletonLazy();//Eger instatiation
	static int count;
	private SingletonLazy() {
		count++;
		System.out.println("obj created "+count+" times");
	}
	public static SingletonLazy getObject() {
		return obj;
	}
}

