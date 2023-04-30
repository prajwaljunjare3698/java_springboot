package com.jspider.collection;

import java.util.ArrayList;
import java.util.Collections;

class Test implements Comparable<Test>{
	int id;
	String name;
	
	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Test t) {
		
		return name.compareTo(t.name);
	}	
}
public class CompareToPro {
	public static void main(String[] args) {
		ArrayList<Test> a = new ArrayList<>();
		a.add(new Test(12, "aksh"));
		a.add(new Test(32, "paud"));
		a.add(new Test(4, "first"));		
		
		Collections.sort(a);
		for(Test t:a) {
			System.out.println(t.id+" "+t.name);//sort by name
		}
	}
}
