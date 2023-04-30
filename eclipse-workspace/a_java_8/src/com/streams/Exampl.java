package com.streams;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int age;
	private String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}
class Em{
	private int age;
	private String name;
	public Em(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Em [age=" + age + ", name=" + name + "]";
	}
}
public class Exampl {
	public static void main(String[] args) {
		List<Student> a = new ArrayList<>();
		a.add(new Student(2, "kuldeep"));
		a.add(new Student(5, "rushi"));
		a.add(new Student(7, "satj"));
		a.add(new Student(1, "akshya"));
		
		List<Em>b = new ArrayList<>();
		for(Student el:a) {
			b.add(new Em(el.getAge(),el.getName()));
		}
		System.out.println(b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
