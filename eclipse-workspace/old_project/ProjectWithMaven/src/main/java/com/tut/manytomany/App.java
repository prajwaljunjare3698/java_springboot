package com.tut.manytomany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEid(101);
		e2.setEid(102);
		e1.setEname("akash");
		e2.setEname("vaibhav");
		
		Project p1 = new Project();
		Project p2 = new Project();
		p1.setPid(1212);
		p1.setPid(2324);
		p1.setPname("libray management");
		p1.setPname("chatbox");
		
		List<Employee> list1 = new ArrayList<Employee>();
		List<Project> list2 = new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p1.setEmp(list1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(e1);
		session.save(e2);
		tx.commit();
		
		factory.close();
		session.close();
	}
}
