package com.jspider.MusicaPlayer_hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class SongTable {

	public static String query;
	
	public static void songTable() {
	
		if(MusicPlayerDAO.songIdList.isEmpty()!=true) {
			
			// writing query to select all records in table with all properties
			query = "from MusicPlayerDTO";
			Query createQuery = MusicPlayerDAO.manager.createQuery(query);
			List<MusicPlayerDTO> playList = createQuery.getResultList();
			
			System.err.println("*id    *name         *singer     *length");
			
				for(MusicPlayerDTO song:playList) {		
					
					System.out.println(song.getId()+" "+song.getName()
					+" "+song.getSinger()+" "+song.getLength());
				}
				System.out.println();
		}	
		else {
			System.err.println("Music_list is empty");
			System.out.println("add song first...");
		}
	}
}
