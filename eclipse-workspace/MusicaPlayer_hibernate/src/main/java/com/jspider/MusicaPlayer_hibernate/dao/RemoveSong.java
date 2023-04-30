package com.jspider.MusicaPlayer_hibernate.dao;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class RemoveSong {

	public static void removeSong() {
		
		// first showing user songList for selecting purpose to remove
		System.err.println("*id    *name         *singer     *length");
		boolean flag = DisplaySongList.displayListOfSong();
		
		if(flag) {
			
			// System.out.println("1.remove specific2.remove all\n");
			
			System.out.println("enter id to delete song");
			int id = MusicPlayerDAO.scanner.nextInt();
			
			if(MusicPlayerDAO.songIdList.contains(id)) {
				
				MusicPlayerDAO.transaction.begin();
				
				MusicPlayerDTO song = MusicPlayerDAO.manager.find(MusicPlayerDTO.class, id);
				
				MusicPlayerDAO.manager.remove(song);				
								
				MusicPlayerDAO.songIdList.remove(MusicPlayerDAO.songIdList.indexOf(id));
				
				MusicPlayerDAO.transaction.commit();
				
				System.out.println("song deleted...");
				
				try { 
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 		
			}
			else {
				System.out.println("enter proper id...");
			}
		}
		else {
			System.out.println("Music_list is empty");
			MusicPlayerDAO.musicMenu();
		}
	}
} 
