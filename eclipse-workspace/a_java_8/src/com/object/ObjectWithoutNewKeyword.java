package com.object;

public class ObjectWithoutNewKeyword {
	int a = 10;
	public static void main(String[] args) {
		ObjectWithoutNewKeyword obj = new ObjectWithoutNewKeyword();

		Runtime r = Runtime.getRuntime();
		System.out.println(r.version());
		System.out.println(r.freeMemory());
	}
}
