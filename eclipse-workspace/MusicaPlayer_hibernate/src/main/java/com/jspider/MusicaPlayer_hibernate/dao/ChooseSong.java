package com.jspider.MusicaPlayer_hibernate.dao;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class ChooseSong {

	public static void chooseSong() {

		// first we'll check that inside table are there songs or not?
		// if yes then displayListOfSong() will return true and we continue
		boolean flag = DisplaySongList.displayListOfSong();
		
		if(flag) {
			System.out.println("\n enter song_id to play song");
			int id = MusicPlayerDAO.scanner.nextInt();
			
			if(MusicPlayerDAO.songIdList.contains(id)) {
				
				// find the id entered by user and then perform operation on it...
				MusicPlayerDTO song = MusicPlayerDAO.manager.find(MusicPlayerDTO.class, id);
							
				try {
					System.out.println(song.getName()+" is playing \n");
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}     
			else {
				System.err.println("enter proper id");
				
				// if user entered id is wrong then again 
				// call the chooseSong() for same procedure
				chooseSong();
			}
		}
		else {
			// if there is no song in table then print the message empty
			System.out.println("Music_list is empty...");
			
		}
	}

}
