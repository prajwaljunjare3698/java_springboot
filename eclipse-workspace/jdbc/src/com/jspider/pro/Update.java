package com.jspider.pro;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Update {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("D:\\workspace\\eclipse-workspace\\jdbc\\src\\com\\jspider\\pro\\db_info.properties");
			Properties properties = new Properties();
			properties.load(file);
			Class.forName(properties.getProperty("driver"));
			Connection connection = DriverManager.getConnection(properties.getProperty("url"),properties);
			PreparedStatement preparedStatement = connection.prepareStatement("update student set name='akash' where id=2");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
