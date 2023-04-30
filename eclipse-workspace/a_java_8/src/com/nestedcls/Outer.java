package com.nestedcls;

//public class Outer {
//	static int a = 20;
//	class Inner{
//		static int a = 10;
//		public static void main(String[] args) {
//			System.out.println(a);
//		}
//	} not getting any output cause main in inner class
//}

public class Outer {
	static int a = 20;
	class Inner{
		static int b = 10;		
	} 
	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = o.new Inner();
		System.out.println(Inner.b);
	}
}
