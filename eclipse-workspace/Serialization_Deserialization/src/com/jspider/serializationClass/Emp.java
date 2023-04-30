package com.jspider.serializationClass;

import java.io.Serializable;

public class Emp implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2501901156700713249L;
	int id;
	String name;
	String city;
	public Emp(int id, String name,String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name +", city "+city+  "]";
	}
	
	
//	@Override
//	public String toString() {
//		return "Emp [id=" + id + ", name=" + name + "]";
//	}
//
//	public Emp(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	
	
}
