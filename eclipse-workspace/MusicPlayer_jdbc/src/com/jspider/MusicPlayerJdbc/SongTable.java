package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class SongTable {

	public static void songTable() {
		try {
			RequiredResources.fileReader = new FileReader(RequiredResources.filePath);
			RequiredResources.properties.load(RequiredResources.fileReader);
			Class.forName(RequiredResources.properties.getProperty("driverPath"));
			
			RequiredResources.connection = DriverManager.getConnection(RequiredResources.properties.getProperty("db_url"),RequiredResources.properties);
			RequiredResources.statement = RequiredResources.connection.createStatement();
			
			String query = "select * from musicplayer";
			
			RequiredResources.resultSet = RequiredResources.statement.executeQuery(query);
			System.out.println("*id  *Name      *singer    *length");
			
			int value=0;
			while(RequiredResources.resultSet.next()) {
				System.out.println(RequiredResources.resultSet.getInt(1)+"    "+RequiredResources.resultSet.getString(2)+"    "+RequiredResources.resultSet.getString(3)+"    "+RequiredResources.resultSet.getString(4));
				value++;
			}
			if(value==0) {
				System.out.println("table is empty insert songs");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
