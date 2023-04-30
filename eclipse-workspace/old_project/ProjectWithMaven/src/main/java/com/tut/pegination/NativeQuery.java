package com.tut.pegination;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class NativeQuery {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		//SQL query
		String q = "select * from Pegination";
		Query nq = s.createSQLQuery(q);
		
		List<Object[]> list = nq.list();
		for(Object[] pg:list) {
			System.out.println(Arrays.toString(pg));
		}
		
		s.close();
		factory.close();
	}
}
