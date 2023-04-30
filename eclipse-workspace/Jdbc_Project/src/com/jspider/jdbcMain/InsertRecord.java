package com.jspider.jdbcMain;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class InsertRecord {
	
	public static ArrayList<String> list = new ArrayList<String>();
	
	public static void insertData() throws Exception {
				
		DatabaseProperties.fileReader = new FileReader(DatabaseProperties.filePath);
		DatabaseProperties.properties.load(DatabaseProperties.fileReader);		
		Class.forName(DatabaseProperties.properties.getProperty("driverPath"));
		DatabaseProperties.connection = DriverManager.getConnection(DatabaseProperties.properties.getProperty("db_url"),DatabaseProperties.properties);
	
		System.out.println("select table to insert records");
		String query = "show tables";	
		
		DatabaseProperties.statement = DatabaseProperties.connection.createStatement();
		DatabaseProperties.resultSet = DatabaseProperties.statement.executeQuery(query);
		
		while(DatabaseProperties.resultSet.next()) {
			System.out.println(DatabaseProperties.resultSet.getString(1));
			//adding the tables name for examining
			list.add(DatabaseProperties.resultSet.getString(1));
		}		
		
		System.out.println("enter table name to insert records");
		String tableName = DatabaseProperties.scanner.next();
		
		if(list.contains(tableName)==true) { 
			query = "desc "+tableName;
		}
		
		else {
			System.out.println("enter tableName properly");
		}
			
		while(DatabaseProperties.resultSet.next()) {
			System.out.println(DatabaseProperties.resultSet.getString(1)+" "+DatabaseProperties.resultSet.getString(2)
			+" "+DatabaseProperties.resultSet.getString(3));
		}			
		
		System.out.println(tableName+" properties are");
		String tableProperties = "desc "+tableName;
		
		System.out.println("how many record you want to insert into "+tableName);
		int count = DatabaseProperties.scanner.nextInt();	
				
		for(int i=1;i<=count;i++) { 
			System.out.println("enter properties");
			query = "insert into "+tableName+" values()";
		}	
	}
}
