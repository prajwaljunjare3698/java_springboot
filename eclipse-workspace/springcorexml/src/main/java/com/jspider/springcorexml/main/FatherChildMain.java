package com.jspider.springcorexml.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.onetomany.bean.FatherBean;

public class FatherChildMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("fatherchildconfig.xml");

//		FatherBean father = context.getBean(FatherBean.class);
		
		FatherBean father = (FatherBean)context.getBean("father1");
		
		System.out.println(father);

		((ClassPathXmlApplicationContext)context).close();
	}
}
