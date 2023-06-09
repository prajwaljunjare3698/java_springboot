package com.jspider.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;

import com.jspider.hibernate.dto.StudentDTO;

public class RetriveRecords {
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
			
			
			//user class name not user_define table name
			//query = "from student";	op-exception
			
			query = "from StudentDTO dsd927356hf";	//still it is working fine dont know why
			Query createQuery = manager.createQuery(query);
			List students = createQuery.getResultList();
			
			for(int i=0;i<students.size();i++) {
				System.out.println(students.get(i));
			}
			
//			List<StudentDTO>students = createQuery.getResultList();
//			for(StudentDTO st:students) {
//				System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail()+" "+st.getContact());
//			}
			
		
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
