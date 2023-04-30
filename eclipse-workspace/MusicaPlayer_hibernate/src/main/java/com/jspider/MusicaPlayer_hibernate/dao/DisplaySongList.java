package com.jspider.MusicaPlayer_hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class DisplaySongList {

	public static boolean displayListOfSong() {
		
		if(MusicPlayerDAO.songIdList.isEmpty()!=true) {
			
			// fire the query for showing all song present int table
			String query = "from MusicPlayerDTO";
			
			Query createQuery = MusicPlayerDAO.manager.createQuery(query);
			List<MusicPlayerDTO> playList = createQuery.getResultList();
			
			for(MusicPlayerDTO song:playList) {	
				// showing only songId and songName
				System.out.println(song.getId()+" "+song.getName());
			}			
			return true;
		}
		return false;
		
	}
	public static void countSongs() {
		
		// write query for display all songs prensent in table
		String query = "from MusicPlayerDTO";
		
		// for firing user defined query need the Query interface 
		Query createQuery = MusicPlayerDAO.manager.createQuery(query);
		
		// get the songs in playList obj
		List<MusicPlayerDTO> playList = createQuery.getResultList();
		
		for(MusicPlayerDTO song:playList) {
			// save the song id's in main song list
			MusicPlayerDAO.songIdList.add(song.getId());		
		}
	}

}
