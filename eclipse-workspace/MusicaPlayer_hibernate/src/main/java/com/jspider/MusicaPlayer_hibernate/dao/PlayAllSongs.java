package com.jspider.MusicaPlayer_hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class PlayAllSongs {

	public static void PlayAllSong() {

		if(MusicPlayerDAO.songIdList.isEmpty()!=true) {
			
			// firing query to select all records in table
			String query = "from MusicPlayerDTO";
			
			Query createQuery = MusicPlayerDAO.manager.createQuery(query);
			List<MusicPlayerDTO> playList = createQuery.getResultList();
			
			for(MusicPlayerDTO song:playList) {
				
				try {
					// it will display all song with diff in time 0.7sec
					System.out.println(song.getName()+" is playing");
					Thread.sleep(700);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
			}				
		}
		else {
			System.out.println("music List is empty...");
			System.out.println("add songs");
		}
	}

}
