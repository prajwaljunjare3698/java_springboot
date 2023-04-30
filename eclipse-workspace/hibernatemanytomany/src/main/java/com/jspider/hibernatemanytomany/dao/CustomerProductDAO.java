package com.jspider.hibernatemanytomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernatemanytomany.dto.CustomerDTO;
import com.jspider.hibernatemanytomany.dto.ProductDTO;

public class CustomerProductDAO {
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
			
			CustomerDTO customer1= new CustomerDTO();
			customer1.setId(1);
			customer1.setName("bhide");
			customer1.setContact(1234);
			customer1.setEmail("bhide@madhvi.com");
			
			CustomerDTO customer2 = new CustomerDTO();
			customer2.setId(2);
			customer2.setName("iyer");
			customer2.setEmail("iyer@babita.com");
			customer2.setContact(763284);
			
			ProductDTO product1 = new ProductDTO();
			product1.setId(1);
			product1.setName("T.V");
			product1.setCategory("electronics");
			product1.setPrice(12000);
			
			ProductDTO product2 = new ProductDTO();
			product2.setId(2);
			product2.setName("mobile");
			product2.setCategory("electronics");
			product2.setPrice(45000);
			
			List<ProductDTO> product = Arrays.asList(product1,product2);
			List<CustomerDTO> customer = Arrays.asList(customer1,customer2);
			
			customer1.setProduct(product);
			customer2.setProduct(product);
			
			product1.setCustomer(customer);
			product2.setCustomer(customer);
			
			manager.persist(customer1);
			manager.persist(customer2);
			manager.persist(product1);
			manager.persist(product2);
			
			transaction.commit();
			
			
			
		} finally {
			closeConnection();
		}
	} 
}
