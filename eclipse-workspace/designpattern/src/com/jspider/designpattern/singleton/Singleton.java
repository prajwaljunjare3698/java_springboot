package com.jspider.designpattern.singleton;
//Creational design pattern
public class Singleton {
	
	static Singleton obj;
	static int count;
		
	private Singleton() {
		count++;
		System.out.println(count);
	}
	public static Singleton getObject() {
		if(obj==null) {
			return obj = new Singleton();
		}
		return obj;
	}
}
 