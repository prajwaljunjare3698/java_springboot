package com.jspiders.springannotation.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class StudentBean {
//	private int id;	
//	private String name;
//	private String email;
//	private long contact;
//	private String city;	
	
	@Value("2")
	private int id;
	
	@Value("raju")
	private String name;
	
	@Value("raju@dholakpur.com")
	private String email;
	
	@Value("29837")
	private long contact;
	
	@Value("dholakpur")
	private String city;
	
}
