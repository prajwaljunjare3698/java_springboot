package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class ChooseSong {

	public static void chooseSong() {
		if(RequiredResources.list.isEmpty()) {
			System.out.println("music list is empty");		
		}
		else {
			
		
			try {			
				DisplaySongList.displayListOfSong();
				
				RequiredResources.fileReader = new FileReader(RequiredResources.filePath);
				RequiredResources.properties.load(RequiredResources.fileReader);
				Class.forName(RequiredResources.properties.getProperty("driverPath"));			
				RequiredResources.connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
				RequiredResources.statement = RequiredResources.connection.createStatement();
				
				System.out.println("enter id to play song");
				
				int id = RequiredResources.scanner.nextInt();
				int count = CountSong.countSongs();
				if(id<=count) {
					String query = "select name from musicplayer where id="+id;
					RequiredResources.resultSet = RequiredResources.statement.executeQuery(query);		
					
					while(RequiredResources.resultSet.next()) {
						System.out.println(RequiredResources.resultSet.getString(1)+" song playing");
						Thread.sleep(400);
					}				
				}
				else {
					System.err.println("enter proper id");
					ChooseSong.chooseSong();
				}			
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}	
}
