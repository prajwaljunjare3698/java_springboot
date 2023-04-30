package com.tut.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Std s1 = new Std();
		s1.setSid(101);
		s1.setSname("kuldeep");
		s1.setSmail("kul12@gmail.com");
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(s1);
		System.out.println(s1);
		tx.commit();
		
		factory.close();
		session.close();
		
		System.out.println("DATA ADDED");
		
		
	}
}
