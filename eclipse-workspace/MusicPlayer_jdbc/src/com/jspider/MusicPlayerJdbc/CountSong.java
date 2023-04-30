package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class CountSong {

	public static int countSongs() {
		int count=0;
		try {
			
			RequiredResources.fileReader = new FileReader(RequiredResources.filePath);
			RequiredResources.properties.load(RequiredResources.fileReader);
			Class.forName(RequiredResources.properties.getProperty("driverPath"));			
			RequiredResources.connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
			RequiredResources.statement = RequiredResources.connection.createStatement();
			
			String query = "select id from musicplayer";
			
			RequiredResources.resultSet = RequiredResources.statement.executeQuery(query);
			
			while(RequiredResources.resultSet.next()) {
				RequiredResources.list.add(RequiredResources.resultSet.getInt(1));
				count++;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return count;
		
	}
	
	
}
