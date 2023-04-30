package com.jspider.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.onetoone.bean.HusbandBean;

public class HusbandWifeMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("husbandwifeconfig.xml");
		
		HusbandBean husband = context.getBean(HusbandBean.class);
		
//		System.out.println(husband);
		
		System.out.println(husband.getId());
		System.out.println(husband.getName());
		System.out.println(husband.getWife());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
