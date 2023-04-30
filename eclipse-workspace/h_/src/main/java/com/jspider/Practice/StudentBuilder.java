package com.jspider.Practice;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {
	
	public static StudentEntity create() {
		return StudentEntity.builder().name("akash").description("descent body").id(1).build();
	}
	
	public static void main(String[] args) {
//		StudentEntity create = create();
		System.out.println(create());
		
		List<String> name = new ArrayList<>(1);
		name.add("a");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		name.add("d");
		
		
		System.out.println(name);
	}
}