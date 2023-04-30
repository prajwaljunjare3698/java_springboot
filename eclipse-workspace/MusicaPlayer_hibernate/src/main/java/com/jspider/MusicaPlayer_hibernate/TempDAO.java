package com.jspider.MusicaPlayer_hibernate;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.MusicaPlayer_hibernate.dao.DisplaySongList;
import com.jspider.MusicaPlayer_hibernate.dao.MusicPlayerDAO;
import com.jspider.MusicaPlayer_hibernate.dao.UpdateSong;

public class TempDAO {

static boolean loop = true;

	//TempDAO & TempDTO are just for practice purpose
	//for update record again and again
	
	public static EntityManagerFactory factory;
	public static EntityManager manager;
	public static EntityTransaction transaction;
	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static Scanner scanner = new Scanner(System.in);

	
	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("MusicPlayer");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	public static void closeConnection() {		
		if(factory!=null && manager!=null && scanner!=null) {			
			factory.close();
			manager.close();
			scanner.close();
		}
		if(transaction!=null) {
			try {
				transaction.rollback();				
			} catch (Exception e) {
				System.out.println("transaction is committed..");
			}
		}
	}	
	public static void main(String[] args) {		
		try {
			openConnection();			
			while(loop) {
				musicMenu();
			}			
		} finally {
			closeConnection();
		}
	}
	public static void musicMenu() {

		System.out.println("1.song 2.singer 3.close");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		switch (val) {
			case 1:
				transaction.begin();
				TempDTO temp1 = manager.find(TempDTO.class, 1);
				temp1.setName("kesariya");
				manager.persist(temp1);
				transaction.commit();
				break;
			case 2:
				transaction.begin();
				
				TempDTO temp2 = manager.find(TempDTO.class, 1);
				temp2.setSinger("mahiyaa");
				manager.persist(temp2);
				transaction.commit();
				
				break;
			case 3:
				loop=false;
				break;
			default :
				System.out.println("invalid");

		}
	}
}
