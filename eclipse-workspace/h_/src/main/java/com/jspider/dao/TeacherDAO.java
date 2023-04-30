package com.jspider.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.dto.StudentDTO;
import com.jspider.dto.TeacherDTO;

public class TeacherDAO {
	
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
			
			TeacherDTO t1 = new TeacherDTO();
			t1.setContact(234l);
			t1.setName("laxman");
			
			TeacherDTO t2 = new TeacherDTO();
			t2.setContact(68234l);
			t2.setName("ram");
			
			manager.persist(t2);
			manager.persist(t1);
			
			
			StudentDTO s1 = new StudentDTO();
			s1.setName("ab");
			s1.setContact(2343l);
			
			StudentDTO s2 = new StudentDTO();
			s2.setName("hab");
			s2.setContact(743l);
			
			StudentDTO s3 = new StudentDTO();
			s3.setName("ubo");
			s3.setContact(76328234l);
			
			manager.persist(s3);
			manager.persist(s2);
			manager.persist(s2);
			
			transaction.commit();
		} 
		finally {
			closeConnection();
		}
		
		
	}
	
}
