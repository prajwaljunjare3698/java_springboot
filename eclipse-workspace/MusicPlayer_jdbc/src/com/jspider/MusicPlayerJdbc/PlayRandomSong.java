package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

import com.jspider.MusicPlayerJdbc.main.MusicPlayer;

public class PlayRandomSong {

	public static void PlayRandom() {		
		try {
			RequiredResources.fileReader = new FileReader(RequiredResources.filePath);
			RequiredResources.properties.load(RequiredResources.fileReader);
			Class.forName(RequiredResources.properties.getProperty("driverPath"));			
			RequiredResources.	connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
			
			String query = "select id from musicplayer";
			RequiredResources.statement =RequiredResources.connection.createStatement();
			RequiredResources.resultSet = RequiredResources.statement.executeQuery(query);
						
							
			//to get arraylist call the countSong()
			CountSong.countSongs();
			
			//Math.random() * (max - min + 1) + min  
			double id = Math.random() * (RequiredResources.list.size());
			query = "select name from musicplayer where id="+RequiredResources.list.get((int)id);

			RequiredResources.connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
			RequiredResources.statement = RequiredResources.connection.createStatement();
			RequiredResources.resultSet = RequiredResources.statement.executeQuery(query);
			
			while(RequiredResources.resultSet.next()) {
				System.out.println(RequiredResources.resultSet.getString(1)+" is playing");
				Thread.sleep(400);
			}
			MusicPlayer.musicMenu();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
