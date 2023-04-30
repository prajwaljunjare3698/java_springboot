package com.jspider.hibernateonetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernateonetoone.dto.HusbandDTO;
import com.jspider.hibernateonetoone.dto.WifeDTO;

public class HusbandWifeDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {		
		factory = Persistence.createEntityManagerFactory("OneToOne");
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
			System.out.println("transaction is committed");
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			WifeDTO wife = new WifeDTO();
//			wife.setId(1);
			wife.setName("anjali");
			wife.setAge(24);
			wife.setEmail("anjali@kkrh.com");
			wife.setContact(1234567890);
			manager.persist(wife);
			
			HusbandDTO husband = new HusbandDTO();
//			husband.setId(1);
			husband.setName("rahul");
			husband.setEmail("rahul@kkrh.com");
			husband.setAge(26);
			husband.setContact(1234543453);
			
			husband.setWife(wife);
			manager.persist(husband);
			
			transaction.commit();
			//if not use commit then data not going to save...
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
	}
}
