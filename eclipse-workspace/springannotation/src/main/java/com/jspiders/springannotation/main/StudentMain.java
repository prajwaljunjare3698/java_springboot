package com.jspiders.springannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springannotation.bean.StudentBean;
import com.jspiders.springannotation.config.StudentConfig;

public class StudentMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	
//		StudentBean st = context.getBean(StudentBean.class);
//		System.out.println(st);
		
		StudentBean student = (StudentBean) context.getBean("student2");
		System.out.println(student);
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
