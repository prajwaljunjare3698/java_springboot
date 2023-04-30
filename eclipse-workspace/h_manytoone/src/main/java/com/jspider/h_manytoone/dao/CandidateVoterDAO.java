package com.jspider.h_manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.h_manytoone.dto.CandidateDTO;
import com.jspider.h_manytoone.dto.VotersDTO;

public class CandidateVoterDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToOne");
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
			
			CandidateDTO candidate1 = new CandidateDTO();
			candidate1.setName("babu_bhaiya");
			manager.persist(candidate1);
			
			CandidateDTO candidate2 = new CandidateDTO();
			candidate2.setName("kachra_seth");
			manager.persist(candidate2);
			
			VotersDTO voter1 = new VotersDTO();
			voter1.setName("raju");
			voter1.setCandidate(candidate1);
			
			VotersDTO voter2 = new VotersDTO();
			voter2.setName("sham");
			voter2.setCandidate(candidate1);
			
			VotersDTO voter3 = new VotersDTO();
			voter3.setName("anuradha");
			voter3.setCandidate(candidate1);
			
			manager.persist(voter1);
			manager.persist(voter2);
			manager.persist(voter3);
			
			transaction.commit();
			
			
		} finally {
			closeConnection();
		}
	}
}
