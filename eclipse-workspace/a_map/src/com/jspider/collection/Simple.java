package com.jspider.collection;

import java.util.ArrayList;

class Student{
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class Simple {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student(1, "kuldeep"));
		al.add("akash");
		al.add(23);
		
		//System.out.println(al);//hashcode...
		
		for(Object o:al) {
			if(o instanceof Student) {
				System.out.println(((Student) o).getId());
			}
			if(o instanceof Student) {
				Student s = (Student)o;
				System.out.println(s.getName());
			}
			else {
				System.out.println(o);
			}
		}
	}
}
