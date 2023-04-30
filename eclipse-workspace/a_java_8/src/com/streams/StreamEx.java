package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
class User{
	int id;
	String name;
	double sal;
	public User(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
public class StreamEx {
	public static void main(String[] args) {
//		ArrayList<String>a = new ArrayList<>(List.of("rai","agksh","roho","pojkko","kuld"));
		
		//to print all
//		a.stream().forEach(System.out::println);
		
//		 start with a
//		a.stream().filter(e-> e.startsWith("a")).forEach(System.out::println);
		
//		lenth
//		a.stream().map(String::length).forEach(System.out::println);
	
//		only 2 records starting
//		a.stream().limit(2).forEach(System.out::println);
	
//		skip 2 records
//		a.stream().skip(2).forEach(System.out::println);
		
		ArrayList<User> a = new ArrayList<>();
		a.add(new User(1, "akshya", 2000));
		a.add(new User(2, "rohit", 3000));
		a.add(new User(3, "rushi", 8000));
		a.add(new User(4, "kuldeep", 6000));
		a.add(new User(5, "uday", 4000));
	
		//get nth sal 2nd
//		Optional<User> findFirst = a.stream().sorted(Comparator.comparingDouble(User::getSal).reversed()).skip(1).findFirst();
//		System.out.println(findFirst);
		
		//4th highest
//		Optional<User> fourth = a.stream().sorted(Comparator.comparingDouble(User::getSal).reversed()).skip(3).findFirst();
//		System.out.println(fourth);
	}
}
