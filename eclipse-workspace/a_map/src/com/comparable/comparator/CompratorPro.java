package com.comparable.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Product{
	int id;
	String name;
	double cost;
	
	public Product(int id, String name,double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
}
class IdComp implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.id<o2.id) {
			return -1;
		}
		else if(o1.id>o2.id) {
			return +1;
		}
		return 0;
	}	
}
class NameComp implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		return p1.name.compareTo(p2.name);
	}	
}
public class CompratorPro {
	public static void main(String[] args) {
		LinkedList<Product> l = new LinkedList<>();
		l.add(new Product(4, "mobile", 12.3));
		l.add(new Product(1, "dress", 54.1));
		l.add(new Product(6, "electronics", 22));
		
		Collections.sort(l,new NameComp());
//		Iterator<Product> itr = l.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next().id+" "+itr.next().name+" "+itr.next().cost);
//		}
		//now show proper op cause cursor is moving next element
		
		for(Product p:l) {
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
	}
} 
