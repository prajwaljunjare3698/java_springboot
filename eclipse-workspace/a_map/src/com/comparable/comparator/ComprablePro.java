package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>{
	int id;
	String name;
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Emp o) {
		if(id<o.id) {
			return -1;
		}
		if(id>o.id) {
			return +1;
		}
		return 0;
	}
	
}
public class ComprablePro {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<>();
		a.add(new Emp(5, "aksh"));
		a.add(new Emp(2, "sf"));
		a.add(new Emp(8, "aksh"));
		
		Collections.sort(a);
//		System.out.println(a);
		for(Emp e:a) {
			System.out.println(e.id+" "+e.name);
		}
		
	}
}
