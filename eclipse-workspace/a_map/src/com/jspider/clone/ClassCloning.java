package com.jspider.clone;

public class ClassCloning implements Cloneable {
	int a = 10;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ClassCloning c1 = new ClassCloning();
		System.out.println(c1.a);
		
		ClassCloning c2 = (ClassCloning) c1.clone();
		System.out.println(c2.a);
		
		System.out.println("sdkfl".equals("sdkfl"));
	}
}
