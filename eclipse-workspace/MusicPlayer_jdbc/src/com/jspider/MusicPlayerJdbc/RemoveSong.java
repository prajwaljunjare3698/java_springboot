package com.jspider.MusicPlayerJdbc;

public class RemoveSong {

public static void removeSong() {
		
		try {
			System.out.println("present songs are...");
			
			DisplaySongList.displayListOfSong();;
			
			System.out.println("enter id to delete song");
			int id = RequiredResources.scanner.nextInt();
			CountSong.countSongs();
			
			if(RequiredResources.list.contains(id)) {
				String query = "delete from musicplayer where id="+id;
				
				RequiredResources.statement = RequiredResources.connection.createStatement();
				int result = RequiredResources.statement.executeUpdate(query);				
				RequiredResources.list.remove(Integer.valueOf(id));
				
				System.out.println(result+" song deleted");
			}
			else {
				System.err.println("enter proper id");
				RemoveSong.removeSong();
			}
						
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
