package com.tut.pegination;
//
//import javax.persistence.Query;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Transient state ie. creating obj
//		Pegination p = new Pegination();
//		p.setEid(105);
//		p.setEname("kuldeep");
//		p.setEage(24);
//		p.setEplace("gudinl");
		
		//implementing pegination using hibernate		
		Query q = session.createQuery("from pegination");
		q.setFirstResult(0);
		q.setMaxResults(3);

//		List<Pegination> lList = q.list();
//		for(Pegination itr:list) {
//			System.out.println(itr.getEid()+" "+itr.getEname()+" "+itr.getEplace());
//		}
		
		session.close();
		factory.close();
	}
}
