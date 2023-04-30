package com.jspider.pro;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class CRUD {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("D:\\workspace\\eclipse-workspace\\jdbc\\src\\com\\jspider\\pro\\db_info.properties");
			Properties properties = new Properties();
			properties.load(file);
			Class.forName(properties.getProperty("driver"));
			Connection connection = DriverManager.getConnection(properties.getProperty("url"),properties);
			PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
			System.out.println("data fetched succesfully...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
