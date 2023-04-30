package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class PlayAllSongs {

	public static void PlayAllSong() {		
		try {
			RequiredResources.fileReader = new FileReader(RequiredResources.filePath);
			RequiredResources.properties.load(RequiredResources.fileReader);
			Class.forName(RequiredResources.properties.getProperty("driverPath"));
			
			RequiredResources.connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
			RequiredResources.statement = RequiredResources.connection.createStatement();
			
			String query = "select * from musicplayer";
			
			RequiredResources.resultSet = RequiredResources.statement.executeQuery(query);
			while(RequiredResources.resultSet.next()) {
				
				System.out.println(RequiredResources.resultSet.getString(2)+" is playing");
				Thread.sleep(400);
			}
			//MusicPlayer.musicMenu(); 
		
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
