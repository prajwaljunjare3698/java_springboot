package com.jspider.hibernatemanytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernatemanytoone.dto.CompanyDTO;
import com.jspider.hibernatemanytoone.dto.EmployeeDTO;

public class CompanyEmplyoeeDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToOne");
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
		if(transaction!=null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction is committed...");
				//e.printStackTrace();
			}			
		}
	}
	public static void main(String[] args) {
		try {
			
			openConnection();
			transaction.begin();
			
			CompanyDTO company = new CompanyDTO();
			company.setId(101);
			company.setName("Laxmi_chit_fund");
			company.setCity("mumbai");			
			
			EmployeeDTO emp1 = new EmployeeDTO();
			emp1.setId(11);
			emp1.setName("anuradha");
			emp1.setEmail("anuradha@lxmifund.com");
			emp1.setCompany(company);
			manager.persist(emp1);
			
			EmployeeDTO emp2 = new EmployeeDTO();
			emp2.setId(21);
			emp2.setName("anuradha_ka_bhai");
			emp2.setEmail("bhai@ek_ka_double_wadapao.com");
			emp2.setCompany(company);
			manager.persist(emp2);
			
			EmployeeDTO emp3 = new EmployeeDTO();
			emp3.setId(31);
			emp3.setName("totlaset");
			emp3.setEmail("totlaset@talislakh.com");
			emp3.setCompany(company);
			manager.persist(emp3);
			
			manager.persist(company);
			
			transaction.commit();			
		}
		finally { 
			closeConnection();
		}
	}

}

