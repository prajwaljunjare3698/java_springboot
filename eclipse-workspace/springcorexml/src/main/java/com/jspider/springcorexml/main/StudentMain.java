package com.jspider.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.bean.StudentBean;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
		
		
//		first way to create bean
		
//		StudentBean studentBean = context.getBean(StudentBean.class);
//		System.out.println(studentBean);
		
		
//		second way to create bean
		StudentBean studentBean1 = (StudentBean)context.getBean("student1");

		//		System.out.println(context.containsBean("student1"));	//true
	
		System.out.println(studentBean1);
		
//		StudentBean studentBean2 = (StudentBean)context.getBean("student2");
//		System.out.println(studentBean2);
		
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
