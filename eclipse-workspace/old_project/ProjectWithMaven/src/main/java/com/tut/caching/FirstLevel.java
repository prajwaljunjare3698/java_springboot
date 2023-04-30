package com.tut.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevel {
	public static void main(String[] args) {
		SessionFactory fact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = fact.openSession();
		
		//creating student object
//		StudentCache s1 = new StudentCache();
//		s1.setSid(101);
//		s1.setSname("akash");
//		s1.setSplace("lonar");
//		
//		StudentCache s2 = new StudentCache();
//		s2.setSid(102);
//		s2.setSname("vaibhav");
//		s2.setSplace("washim");
//		
//		Transaction tx = session.beginTransaction();
//		session.save(s1);
//		session.save(s2);
//		tx.commit();

		StudentCache sc = session.get(StudentCache.class, 101);
		System.out.println(sc);
		System.out.println(session.contains(sc));
		
		StudentCache sc1 = session.get(StudentCache.class, 101);
		//no need to fire query now cause obj already in session 
		System.out.println(sc1);
		System.out.println(session.contains(sc));

		
		
		session.close();
	}
}
