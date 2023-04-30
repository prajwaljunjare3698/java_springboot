package com.jspider.singleton.lazy.main;

import com.jspider.singleton.lazyclass.SingletonLazy;

public class SingletonLazyMain {
	public static void main(String[] args) {
		SingletonLazy.getObject();
		SingletonLazy.getObject();
		SingletonLazy.getObject();
		
		
//		SingletonLazy obj = SingletonLazy.getObject();
//		System.out.println(obj);
		SingletonLazy obj2 = SingletonLazy.getObject();
		System.out.println(obj2);
		
		//it will create object only one time
	}
}
