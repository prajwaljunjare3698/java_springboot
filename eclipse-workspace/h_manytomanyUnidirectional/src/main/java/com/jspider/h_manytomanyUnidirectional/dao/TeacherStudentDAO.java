package com.jspider.h_manytomanyUnidirectional.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.h_manytomanyUnidirectional.dto.StudentDTO;
import com.jspider.h_manytomanyUnidirectional.dto.TeacherDTO;

public class TeacherStudentDAO {

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
			
			TeacherDTO teacher1 = new TeacherDTO();
			teacher1.setId(1);
			teacher1.setName("dhananjay_sir");
			
			TeacherDTO teacher2 = new TeacherDTO();
			teacher2.setId(2);
			teacher2.setName("ishwar_sir");
			
			TeacherDTO teacher3 = new TeacherDTO();
			teacher3.setId(3);
			teacher3.setName("ajay_sir");
			
			StudentDTO student1 = new StudentDTO();
			student1.setId(1);
			student1.setName("sanket");
			
			StudentDTO student2 = new StudentDTO();
			student2.setId(2);
			student2.setName("kuldeep");
			
			StudentDTO student3 = new StudentDTO();
			student3.setId(3);
			student3.setName("rushi");
			
			List<TeacherDTO> teachers = Arrays.asList(teacher1,teacher2,teacher3);
						
			student1.setTeachers(teachers);
			student2.setTeachers(teachers);
			student3.setTeachers(teachers);
			
			manager.persist(student1);
			manager.persist(student2);
			manager.persist(student3);
			manager.persist(teacher1);
			manager.persist(teacher2);
			manager.persist(teacher3);
			
			transaction.commit();
			
			
		} finally {
			closeConnection();
		}
	}
}
