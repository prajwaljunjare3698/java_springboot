package com.jspider.MusicaPlayer_hibernate.dao;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class PlayRandomSong {

	public static void PlayRandom() {

		if(MusicPlayerDAO.songIdList.isEmpty()!=true) {
			
			// generating random no from the available id present in list
			// Math.random() * (max - min + 1) + min  
			double id = Math.random() * (MusicPlayerDAO.songIdList.size());
			
			// converting double to int
			int intId = (int)id;
					
			MusicPlayerDTO song = MusicPlayerDAO.manager.find(MusicPlayerDTO.class, MusicPlayerDAO.songIdList.get(intId));
						
			try {
				System.out.println(song.getName()+" is playing");
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		else {
			System.out.println("MusicList is empty...");
		}
	}
}
