package com.jspider.singleton.egerclass;

public class SingletonEger {		
	static SingletonEger obj = new SingletonEger();//Eger instatiation
	static int count;
	private SingletonEger() {
		count++;
		System.out.println("obj created "+count+" times");
	}
	public static SingletonEger getObject() {
		return obj;
	}
}

