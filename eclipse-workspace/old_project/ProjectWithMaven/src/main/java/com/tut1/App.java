package com.tut1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//create object of student class
		StudentData studentData = new StudentData();
		studentData.setSid(11);
		studentData.setSname("ajay");
		studentData.setSemail("ajay23@gmail.com");
		
		//create object of certificate class
		Certificate certificate = new Certificate();
		certificate.setCourse("sql");
		certificate.setDuration(4.3);
				
		studentData.setCerti(certificate);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(studentData);
		session.save(certificate);
		tx.commit();
		System.out.println("tables creted with fields");
		
	}
}
