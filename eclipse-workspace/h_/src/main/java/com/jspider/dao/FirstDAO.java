package com.jspider.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.dto.FirstDTO;

public class FirstDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("Student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();		
	}
	private static void closeConnection() {
		if(factory!=null && manager!=null) {
			factory.close();
			manager.close();
		}
		if(transaction!=null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction committed...");
			}
		}
	}
	public static void main(String[] args) {
		try {
			
			openConnection();
			transaction.begin();
						
			FirstDTO f1 = new FirstDTO();			
			f1.setName("prajwal");
			
			FirstDTO f2 = new FirstDTO();			
			f2.setName("akash");
			
			FirstDTO f3 = new FirstDTO();			
			f3.setName("abhishek");
			
			manager.persist(f1);
			manager.persist(f2);
			manager.persist(f3);
			
						
			transaction.commit();
		} 
		finally {
			closeConnection();
		}
		
		
	}
}
