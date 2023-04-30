package com.jspiders.springannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springannotation.bean.StudentBean;

public class StudentConfig {
	
	@Bean
	public StudentBean getStudent1() {
		
		StudentBean student = new StudentBean();
		student.setId(1);
		student.setName("kautilya");
		student.setEmail("kautilya@world.com");
		student.setContact(8739234L);
		student.setCity("Mumbai");
		
		return student;
	}
	@Bean(name = "student2")
	public StudentBean getStudent2() {
		StudentBean student = new StudentBean();
		return student;
	}
}
