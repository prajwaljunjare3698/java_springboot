package com.jspider.onettomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.onettomany.dto.CompanyDTO;
import com.jspider.onettomany.dto.SectorsDTO;

public class CompanySectorsDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToMany");
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
				System.out.println("transaction is committed...");
			}
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			CompanyDTO company = new CompanyDTO();
			company.setId(1);
			company.setName("TaTa Enterprises");
			company.setHeadquarter("Mumbai");
			
			SectorsDTO sector1 = new SectorsDTO();
			sector1.setId(1);
			sector1.setName("Tata_Consultancy_Services");
			manager.persist(sector1);
			
			SectorsDTO sector2 = new SectorsDTO();
			sector2.setId(2);
			sector2.setName("Tata_Motors");
			manager.persist(sector2);
			
			SectorsDTO sector3 = new SectorsDTO();
			sector3.setId(3);
			sector3.setName("Tata_Steel");
			manager.persist(sector3);
			
			List<SectorsDTO> sectors = Arrays.asList(sector1,sector2,sector3);
			company.setSectors(sectors);
			manager.persist(company);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}
