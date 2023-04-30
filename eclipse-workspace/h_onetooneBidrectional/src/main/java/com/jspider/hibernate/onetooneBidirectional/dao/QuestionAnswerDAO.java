package com.jspider.hibernate.onetooneBidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernate.onetooneBidirectional.dto.AnswerDTO;
import com.jspider.hibernate.onetooneBidirectional.dto.QuestionDTO;

public class QuestionAnswerDAO {
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
			
			QuestionDTO question1 = new QuestionDTO();
			question1.setId(1);
			question1.setQuestion("what is java?");
			
			QuestionDTO question2 = new QuestionDTO();
			question2.setId(2);
			question2.setQuestion("what is hibernate?");
			
			AnswerDTO answer1 = new AnswerDTO();
			answer1.setId(1);
			answer1.setAnswer("java is programming language");
			
			AnswerDTO answer2 = new AnswerDTO();
			answer2.setId(2);
			answer2.setAnswer("hibernate is ORM tool");		
			
			question1.setAnswer(answer1);
			question2.setAnswer(answer2);
			
			answer1.setQuestion(question1);
			answer2.setQuestion(question2);
			 
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
