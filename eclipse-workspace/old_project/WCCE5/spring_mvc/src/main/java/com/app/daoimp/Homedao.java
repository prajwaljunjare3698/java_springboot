package com.app.daoimp;

import org.apache.catalina.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.dao.daointerface;


public class Homedao implements daointerface {
	
	SessionFactory sessionFactory;
	@Override
	public int savedata1(User user) {
		
		Session session=sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		
		int id=(int) session.save(user);
		beginTransaction.commit();
		session.close();
		return id;
	}
	
}
