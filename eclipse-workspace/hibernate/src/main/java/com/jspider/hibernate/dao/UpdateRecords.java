package com.jspider.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;

public class UpdateRecords {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static String query;
	
	private static void openConnection() {
		
		factory = Persistence.createEntityManagerFactory("Student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		try {
			transaction.rollback();
		} catch (TransactionException e) {
			System.out.println("transaction committed..");
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			transaction.commit();			
		}
		finally {
			closeConnection();
		}
	}
}
