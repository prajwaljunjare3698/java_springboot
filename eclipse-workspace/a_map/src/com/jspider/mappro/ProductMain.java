package com.jspider.mappro;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Product{
	int id;
	String name;
	double cost;
	public Product(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
}

public class ProductMain {
	public static void main(String[] args) {
		Map<Integer, Product> m = new LinkedHashMap<>();
		m.put(1, new Product(23,"mobile",1200.00));
		m.put(2, new Product(24, "dress", 200.00));
		m.put(3, new Product(35, "home", 123.44));
		
		Set<Entry<Integer,Product>> entrySet = m.entrySet();
		for(Entry<Integer,Product> e:entrySet) {
			System.out.println(e.getKey()+" "+e.getValue().id+" "+e.getValue().name+" "+e.getValue().cost);
		}
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Product> values = m.values();
		for(Product p:values) {
			if(p.id==23) {
				m.remove(p);
			}
			else {
				System.out.println(p.id+" "+p.name+" "+p.cost);
			}
		}
	}
}
