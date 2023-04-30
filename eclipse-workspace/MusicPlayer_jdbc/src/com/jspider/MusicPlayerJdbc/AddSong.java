package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

import com.jspider.song.operations.MusicPlayer;

public class AddSong {
	
	public static void addSong() {
		
		System.out.println("how many songs u want to add");
		int no = RequiredResources.scanner.nextInt();
		
		for (int i=1;i<=no;i++) {
			try {								
				RequiredResources.fileReader = new FileReader(RequiredResources.filePath);
				RequiredResources.properties.load(RequiredResources.fileReader);
				Class.forName(RequiredResources.properties.getProperty("driverPath"));
				
				RequiredResources.connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
				RequiredResources.statement = RequiredResources.connection.createStatement();
				
				System.out.println("Enter song id:");			
				int id = RequiredResources.scanner.nextInt();
				RequiredResources.list.add(id);
				
				System.out.println("Enter song name:");			
				String songName = RequiredResources.scanner.next();
				
				System.out.println("Enter singer name:");			
				String singerName = RequiredResources.scanner.next();
				
				System.out.println("Enter song length:");			
				double songLength = RequiredResources.scanner.nextDouble();
				
				String query = "insert into musicplayer values(?,?,?,?)";
				RequiredResources.preparedStatement = RequiredResources.connection.prepareStatement(query);
				
				RequiredResources.preparedStatement.setInt(1, id);
				RequiredResources.preparedStatement.setString(2, songName);
				RequiredResources.preparedStatement.setString(3, singerName);
				RequiredResources.preparedStatement.setDouble(4, songLength);
								
				int result = RequiredResources.preparedStatement.executeUpdate();
				
				System.out.println(result+" song added successfully");	
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		MusicPlayer.musicMenu();
		
	}
}
