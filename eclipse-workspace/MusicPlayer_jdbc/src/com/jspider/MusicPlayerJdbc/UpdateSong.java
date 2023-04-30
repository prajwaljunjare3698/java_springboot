package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class UpdateSong {

public static void updateSong() {
		
		try {
			RequiredResources.fileReader = new FileReader(RequiredResources.filePath);
			RequiredResources.properties.load(RequiredResources.fileReader);
			Class.forName(RequiredResources.properties.getProperty("driverPath"));
			
			RequiredResources.connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
			RequiredResources.statement = RequiredResources.connection.createStatement();
			
			//display all song
			System.out.println("present songs are...");
			DisplaySongList.displayListOfSong();
			
			System.out.println("select id of song to update");
			int id = RequiredResources.scanner.nextInt();
			int count = CountSong.countSongs();
			
			if(id<=count) {
				
				System.out.println("update followings\n1.name\n2.singer\n3.length\n");	
				int upd = RequiredResources.scanner.nextInt();
				
				if(upd<=3) {
					switch (upd) {
						case 1:
							System.out.println("enter new songName");
							String songName = RequiredResources.scanner.next();
							String query = "update musicplayer set name=? where id="+id;
							
							RequiredResources.preparedStatement = RequiredResources.connection.prepareStatement(query);
							RequiredResources.preparedStatement.setString(1, songName);						
							int result = RequiredResources.preparedStatement.executeUpdate();						
							
							System.out.println(result+" song update successfully...");						
							
							break;
							
						case 2:
							System.out.println("enter new singer");
							String singerName = RequiredResources.scanner.next();
							query = "update musicplayer set singer=? where id="+id+"";
							
							RequiredResources.preparedStatement = RequiredResources.connection.prepareStatement(query);
							RequiredResources.preparedStatement.setString(1, singerName);						
							result = RequiredResources.preparedStatement.executeUpdate();						
								
							
							System.out.println("song update successfully...");
							break;
							
						case 3:
							System.out.println("enter new songLength");
							String songLength = RequiredResources.scanner.next();
							query = "update musicplayer set length=? where id="+id+"";
							
							RequiredResources.preparedStatement = RequiredResources.connection.prepareStatement(query);
							RequiredResources.preparedStatement.setString(1, songLength);						
							result =RequiredResources.preparedStatement.executeUpdate();						
							
							
							System.out.println("song update successfully...");
							
							break;
		
						default:
							System.out.println("invalid input");
							UpdateSong.updateSong();
							break;
					}
					
				}
				else {
					System.out.println("invalid input");
					UpdateSong.updateSong();
				}
			}
			else {
				System.err.println("select proper id");
				UpdateSong.updateSong();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
