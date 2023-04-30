package com.jspiders.springannotation.bean;

import lombok.Data;

@Data
public class HusbandBean {
	private int id;
	private String name;

	private WifeBean wife;
}
