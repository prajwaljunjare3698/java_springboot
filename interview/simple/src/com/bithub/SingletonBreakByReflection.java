package com.bithub;

import java.lang.reflect.Constructor;

class Singleton{
	static Singleton obj = null;
	private Singleton() {
		
	}
	public static Singleton getInstace() {
		if(obj==null) {
			return new Singleton();
		}
		return obj;		
	}
}
public class SingletonBreakByReflection {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstace();
		System.out.println(obj1.hashCode());
		try {
			Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			Singleton obj2 = constructor.newInstance();
			System.out.println(obj2.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
