package com.jspider.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernate.dto.StudentDTO;

public class StudentDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
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
			
			StudentDTO st1 = new StudentDTO();
			st1.setId(1);
			st1.setName("shubham");
			st1.setEmail("shubham@chikhli.com");
			st1.setContact(3744);
			
			StudentDTO st2 = new StudentDTO();
			st2.setId(2);
			st2.setName("kuldeep");
			st2.setEmail("kuldeep@kolhapur.com");
			st2.setContact(2340);
			
			StudentDTO st3 = new StudentDTO();
			st3.setId(3);
			st3.setName("sanket");
			st3.setEmail("sanket09@baner.com");
			st3.setContact(1242);
			
			
			
			manager.persist(st1);
			manager.persist(st2);
			manager.persist(st3);
			transaction.commit();
			
		}
		finally {
			closeConnection();
		}
	}
}
