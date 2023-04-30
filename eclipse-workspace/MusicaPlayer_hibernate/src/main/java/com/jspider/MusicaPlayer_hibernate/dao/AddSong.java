package com.jspider.MusicaPlayer_hibernate.dao;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class AddSong {

	public static void addSong() {

		MusicPlayerDAO.transaction.begin();
		
		// creating obj of MusicPlayerDTO for setting the values in db
		MusicPlayerDTO song = new MusicPlayerDTO();
				
		System.out.println("Enter song name:");			
		String songName = MusicPlayerDAO.scanner.next();
		
		System.out.println("Enter singer name:");			
		String singerName = MusicPlayerDAO.scanner.next();
		
		System.out.println("Enter song length:");			
		double songLength = MusicPlayerDAO.scanner.nextDouble();
				
		song.setName(songName);
		song.setSinger(singerName);
		song.setLength(songLength);
		
		MusicPlayerDAO.manager.persist(song);
		
		// after inserting the obj in table also need to store that song id
		// in the songIdList for further operation on that song
		MusicPlayerDAO.songIdList.add(song.getId());
		
		MusicPlayerDAO.transaction.commit();
		
		System.out.println("song added successfully");			
	}

}
