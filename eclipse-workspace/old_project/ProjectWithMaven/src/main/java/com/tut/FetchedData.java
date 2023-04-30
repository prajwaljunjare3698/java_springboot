package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchedData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//getting the student whose id is:101
		Student student = (Student)session.get(Student.class, 101);
		System.out.println(student);
		
		Address ad = (Address)session.get(Address.class, 1);
		System.out.println(ad);
		System.out.println(ad.getCity());
	}
}
