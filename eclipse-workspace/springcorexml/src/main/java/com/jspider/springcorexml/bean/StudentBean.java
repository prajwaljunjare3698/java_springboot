package com.jspider.springcorexml.bean;

import lombok.Data;

@Data
public class StudentBean {
	int id;
	String name;
	String email;
	long contact;	
	
//	public void init() {
//		System.out.println("this is init");
//	}
//	public void destroy() {
//		System.out.println("this is destroy");
//	}
}
