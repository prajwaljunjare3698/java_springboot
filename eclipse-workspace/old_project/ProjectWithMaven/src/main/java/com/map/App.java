package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Creating question
		Question q1 = new Question();
		q1.setQuestionId(101);
		q1.setQuestion("what is java?");
		
		//Creating answer
		Answer ans1 = new Answer();
		ans1.setAnswerId(121);
		ans1.setAnswer("java is programming language");
		q1.setAnswer(ans1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(ans1);
		tx.commit();
		session.close();		
		factory.close();
	}
}
