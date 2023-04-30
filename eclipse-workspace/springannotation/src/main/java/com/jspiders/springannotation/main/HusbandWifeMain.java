package com.jspiders.springannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springannotation.bean.HusbandBean;
import com.jspiders.springannotation.config.HusbandWifeConfig;

public class HusbandWifeMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HusbandWifeConfig.class);
		
		HusbandBean husband = context.getBean(HusbandBean.class);
		System.out.println(husband);
		System.out.println(husband.getId());
		System.out.println(husband.getName());
		System.out.println(husband.getWife());		
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
