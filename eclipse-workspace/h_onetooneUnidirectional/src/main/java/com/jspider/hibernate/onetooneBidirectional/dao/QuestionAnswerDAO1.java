package com.jspider.hibernate.onetooneBidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernate.onetooneBidirectional.dto.AnswerDTO1;
import com.jspider.hibernate.onetooneBidirectional.dto.QuestionDTO1;

public class QuestionAnswerDAO1 {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToOne");
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
			
			QuestionDTO1 question1 = new QuestionDTO1();
			question1.setId(1);
			question1.setQuestion("what is hibernate?");
			
			QuestionDTO1 question2 = new QuestionDTO1();
			question2.setId(2);
			question2.setQuestion("why go for hibernate?");
			
			AnswerDTO1 answer1 = new AnswerDTO1();
			answer1.setId(1);
			answer1.setAnswer("hibernate is ORM tool");
			
			AnswerDTO1 answer2 = new AnswerDTO1();
			answer2.setId(2);
			answer2.setAnswer("cause hibernate write queries by its own");		
			
			question1.setAnswer(answer1);
			question2.setAnswer(answer2);
				 
			manager.persist(question1);
			manager.persist(question2);
			manager.persist(answer1);
			manager.persist(answer2);
			
			transaction.commit();
			
			
		} finally {
			closeConnection();
		}
	}
}
