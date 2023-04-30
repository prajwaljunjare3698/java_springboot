package com.jspider.mappro;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Products{
	Integer id;
	String name;
	public Products(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
class Comptr implements Comparator<Products>{
	@Override 
	public int compare(Products p1, Products p2) {
		return -p1.id.compareTo(p2.id);
	}
}
public class ProComp {
	public static void main(String[] args) {
		TreeMap<Products, Integer> t = new TreeMap<>(new Comptr());
		t.put(new Products(333, "mobile"), 1);
		t.put(new Products(444, "dress"), 2);
		t.put(new Products(111, "electronics"), 3);
//		System.out.println(t);	//obj adres 
		
		Set<Entry<Products,Integer>> entrySet = t.entrySet();
		for(Entry<Products,Integer> p:entrySet) {
			System.out.println(p.getValue()+" "+p.getKey().id+" "+p.getKey().name);
		}
		
	}
}
