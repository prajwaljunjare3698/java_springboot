package com.garbage.colle;

public class UseGcMethod {
	public void finalize() {
		System.out.println("object is destroyed...");
	}
	public static void main(String[] args) {
		UseGcMethod obj1 = new UseGcMethod();
		UseGcMethod obj2 = new UseGcMethod();
		UseGcMethod obj3 = new UseGcMethod();
		UseGcMethod obj4 = new UseGcMethod();
		UseGcMethod obj5 = new UseGcMethod();
		obj1 = null;
		obj2 = null;
		
		System.gc();
	}
}
