package com.jspider.h_manytomanyBidirectional.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.h_manytomanyBidirectional.dto.MobileDTO;
import com.jspider.h_manytomanyBidirectional.dto.UserDTO;

public class UserMobileDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToMany");
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
			
			UserDTO user1 = new UserDTO();
			user1.setName("kuldeep");
			
			UserDTO user2 = new UserDTO();
			user2.setName("sanket");
			
			UserDTO user3 = new UserDTO();
			user3.setName("pavan");
			
			MobileDTO mobile1 = new MobileDTO();
			mobile1.setCompany("realme");
			mobile1.setModelNo("realme_8pro");
			
			MobileDTO mobile2 = new MobileDTO();
			mobile2.setCompany("apple");
			mobile2.setModelNo("apple_14pro");
			
			MobileDTO mobile3 = new MobileDTO();
			mobile3.setCompany("onePlus");
			mobile3.setCompany("onePlus_5t");
			
			List<UserDTO> users = Arrays.asList(user1,user2,user3);
			List<MobileDTO> mobiles = Arrays.asList(mobile1,mobile2,mobile3);
			
			user1.setMobile(mobiles);
			user2.setMobile(mobiles);
			user3.setMobile(mobiles);
			
			mobile1.setUser(users);
			mobile2.setUser(users);
			mobile3.setUser(users);
			
			manager.persist(mobile1);
			manager.persist(mobile2); 
			manager.persist(mobile3);
			
			manager.persist(user1);
			manager.persist(user2);
			manager.persist(user3);
						
			transaction.commit(); 			
			
		} finally {
			closeConnection();
		}
	}
}
