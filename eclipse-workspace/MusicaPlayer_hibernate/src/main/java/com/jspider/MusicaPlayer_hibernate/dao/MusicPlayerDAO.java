package com.jspider.MusicaPlayer_hibernate.dao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MusicPlayerDAO {
	
	static boolean loop = true;
	
	public static EntityManagerFactory factory;
	public static EntityManager manager;
	public static EntityTransaction transaction;
	
	// create list to store the all song id's present in table
	// and also add or remove whenever user wants the song....
	public static ArrayList<Integer> songIdList = new ArrayList<Integer>();
	
	public static Scanner scanner = new Scanner(System.in);

	// this method will create connection for require resources...
	public static void openConnection() {
		
		factory = Persistence.createEntityManagerFactory("MusicPlayer");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
	}
	// this method will close all connections for resources required...
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
			
			// every time i'm doing any updation in table then i need to
			// begin that transaction from that method only and commit the 
			// transaction in that method only
			
			// if i begin transaction after openConnection() and commit it before
			// while loop then it throwing an exceptions-> 
											//....error while committing trasaction....
											//....transsaction rollback exception like this
						
			
			
			// when user start the application at that time i need to store the 
			// all song id's  which are present in database table for further operations
			// so countSongs() will store all song id's in songIdList
			DisplaySongList.countSongs();
			
			// applying loop to perform operations until user want.
			while (loop) {				
				musicMenu();
			}				
			
		} finally {
			closeConnection();
			System.out.println("all connections are closed..");
		}
	}
	
	
	// this method will execute until loop is true
	public static void musicMenu() {
		
		System.err.println("Menu:-");
		System.out.println("1.show Music-Table\n2.play \n3.Add/Remove \n4.Edit \n5.Exit");
				
		System.err.println("choose option :-");
		int key =scanner.nextInt();		
		
		switch (key) {
		case 1:
			
			// created a separate songTable()n in SongTable, for showing all the song properties
			// like songId,songName,singerName,songLengh...
			SongTable.songTable();
			musicMenu();
			break;
			
		case 2: {
			System.out.println("1.choose song \n2.play all songs \n3.random song \n4.go back.\n");
			System.err.println("choose option :-");
			int key1 = scanner.nextInt();
			
			switch (key1) {
				case 1: {
					ChooseSong.chooseSong();
					break;
				}
				case 2: {
					PlayAllSongs.PlayAllSong();
					break;
				}
				case 3: {
					PlayRandomSong.PlayRandom();
					break;
				}
				case 4: {
					musicMenu();
					break;
				}
				default :
					System.out.println("invalid input");
					musicMenu();
					break;
				}
			break;
		}
		case 3: {
			System.out.println("1.Add song \n2.Remove song \n3. go back");
			System.err.println("choose option :-");
			int key2 = scanner.nextInt();
			switch (key2) {
				case 1: {
					AddSong.addSong();
					break;
				}
				case 2: {
					RemoveSong.removeSong();
					break;
				}
				case 3: {
					musicMenu();
					break;
				}
				default:
					System.out.println("invalid input");
			}
			break;
		}
		case 4: {
			UpdateSong.updateSong();
			break;
		}
		case 5:
			loop=false;
			break;
		default : {
			System.err.println("invalid input");
			musicMenu();
		}
		}
	}	
}
