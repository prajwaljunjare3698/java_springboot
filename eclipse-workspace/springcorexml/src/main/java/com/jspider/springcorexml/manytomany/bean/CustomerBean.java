package com.jspider.springcorexml.manytomany.bean;

import java.util.List;

import lombok.Data;

@Data
public class CustomerBean {
	
	private int id;
	
	private String name;
	
	private List<ProductBean> products;
}
