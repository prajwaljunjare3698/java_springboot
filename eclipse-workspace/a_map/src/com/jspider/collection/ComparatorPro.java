package com.jspider.collection;

import java.util.ArrayList;
import java.util.Collections;


//class Emp implements Comparable{
class Emp implements Comparable<Emp>{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
//	public int compareTo(Object e) {	
//		Emp e = (Emp)o;
	public int compareTo(Emp e) {		
		if(id==e.id) {
			return 0;
		}
		if(id<e.id) {
			return -1;
		}
		return +1;
	}	
}
public class ComparatorPro {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<Emp>();
		a.add(new Emp(12, "aksh"));
		a.add(new Emp(32, "paud"));
		a.add(new Emp(4, "first"));
		
		Collections.sort(a);
		System.out.println(a);
		for(Emp e:a) {
			System.out.println(e.id+" "+e.name);//sort by id
		}
	}
}
