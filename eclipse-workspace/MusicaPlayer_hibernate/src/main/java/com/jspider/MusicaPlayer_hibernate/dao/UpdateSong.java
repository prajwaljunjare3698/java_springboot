package com.jspider.MusicaPlayer_hibernate.dao;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class UpdateSong {

	public static void updateSong() {

		// creating ref of MusicPlayerDTO for further using purpose
		MusicPlayerDTO song;
			
		if(MusicPlayerDAO.songIdList.isEmpty()!=true) {
		
			System.out.println("present songs are...\n");
			SongTable.songTable();
			System.out.println();
			
			System.out.println("select id of song to update");
			int id = MusicPlayerDAO.scanner.nextInt();
			
			
			if(MusicPlayerDAO.songIdList.contains(id)) {
				
				System.out.println("update followings\n1.name\n2.singer\n3.length\n4.back");	
				int upd = MusicPlayerDAO.scanner.nextInt();
				
		
				switch (upd) {
				
				// for every updation in song we need to begin transaction, persist(save) the object and
				// commit the transaction  
				
				// if transaction is begin only once in starting of method and 
				// commit in ending of method then middle operation user perfomed
				// will not save(although it is persit(save) the object)
				// it will throw and exception->transaction rollback,error while commiting tran.
							
					case 1:
						MusicPlayerDAO.transaction.begin();
						
						System.out.println("enter new songName");
						String songName = MusicPlayerDAO.scanner.next();
						
						song = MusicPlayerDAO.manager.find(MusicPlayerDTO.class, id);
						
						song.setName(songName);
						MusicPlayerDAO.manager.persist(song);
						MusicPlayerDAO.transaction.commit();
						
						System.out.println("song update successfully...");						
						break;
						
					case 2:
						MusicPlayerDAO.transaction.begin();
						
				  		System.out.println("enter new singerName");
						String singerName = MusicPlayerDAO.scanner.next();
						song = MusicPlayerDAO.manager.find(MusicPlayerDTO.class, id);
						
						song.setSinger(singerName);
						MusicPlayerDAO.manager.persist(song);	
						MusicPlayerDAO.transaction.commit();
						
						System.out.println("song update successfully...");
						break;
						
					case 3:
						MusicPlayerDAO.transaction.begin();
						
						System.out.println("enter new songLength"); 
						double songLength = MusicPlayerDAO.scanner.nextDouble();
						song = MusicPlayerDAO.manager.find(MusicPlayerDTO.class, id);
						
						song.setLength(songLength);
						
						MusicPlayerDAO.manager.persist(song);	
						MusicPlayerDAO.transaction.commit();
						
						System.out.println("song update successfully...");								
						break;
						
					case 4:
						MusicPlayerDAO.musicMenu();
						break;
						
					default:
						System.err.println("invalid input");
						UpdateSong.updateSong();
						break;
					}						
				}
			else {
				System.err.println("select proper id");
				UpdateSong.updateSong();
			}			
		}
		else {
			System.out.println("MusicList is empty...");
			MusicPlayerDAO.musicMenu();
		}
	}
}
