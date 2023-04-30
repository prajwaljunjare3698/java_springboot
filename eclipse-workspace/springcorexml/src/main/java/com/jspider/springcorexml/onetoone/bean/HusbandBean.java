package com.jspider.springcorexml.onetoone.bean;

import lombok.Data;

@Data
public class HusbandBean {
	private int id;
	private String name;

	private WifeBean wife;
}
