package com.jspider.springmvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.springmvc.pojo.StudentPojo;

@Repository
public class StudentRepository {
	@Autowired
	private StudentPojo pojo;
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	private static String jpql;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory != null) {
			factory.close();	
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction already committed");
			}
		}
	}

	public StudentPojo login(String username, String password) {
		openConnection();
		transaction.begin();
		
		String query = "from StudentPojo";//use orignal class name not given table name
		Query createQuery = manager.createQuery(query);
		List<StudentPojo> resultList = createQuery.getResultList();
		
		for(StudentPojo student:resultList) {
			if(student.getUsername().equals(username) && student.getPassword().equals(password)) {
		
				return student;
			}
		}	
		closeConnection();
		return null;
	}

	public StudentPojo add(String name, String email, long contact, String city, String username, String password) {
		openConnection();
		transaction.begin();
		
		StudentPojo pojo = new StudentPojo();
		pojo.setName(name);
		pojo.setEmail(email);
		pojo.setContact(contact);
		pojo.setCity(city);
		pojo.setUsername(username);
		pojo.setPassword(password);
		
		manager.persist(pojo);
		transaction.commit();
		
		return pojo;
	}

	public StudentPojo search(int id) {
		openConnection();
		transaction.begin();
		
		StudentPojo pojo = manager.find(StudentPojo.class, id);
		
		return pojo;
	}

	public void update(int id, String name, String email, long contact, String city, String username, String password) {
		openConnection();
		transaction.begin();
		
		StudentPojo pojo = manager.find(StudentPojo.class, id);
		pojo.setName(name);
		pojo.setEmail(email);
		pojo.setContact(contact);
		pojo.setCity(city);
		pojo.setUsername(username);
		pojo.setPassword(password);
		
		manager.persist(pojo);
		transaction.commit();
		
		closeConnection();
		
	}


	public StudentPojo remove(int id) {
		openConnection();
		transaction.begin();
		StudentPojo pojo = manager.find(StudentPojo.class, id);
		if (pojo != null) {
			manager.remove(pojo);
		}
		else {
			return null;
		}
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public List<StudentPojo> showAll() {
		openConnection();
		transaction.begin();
		
		jpql = "from StudentPojo";
		query = manager.createQuery(jpql);
		List<StudentPojo> pojos = query.getResultList();
		
		transaction.commit();
		closeConnection();
		return pojos;
	}
}
