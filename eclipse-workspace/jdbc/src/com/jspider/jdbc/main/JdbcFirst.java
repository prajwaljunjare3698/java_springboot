package com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcFirst {
	public static void main(String[] args) {
		try {
			//Presense Across Nation
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			
			//prepare statement
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from studentdto");
			
			//process the result
			while(resultset.next()) {
				System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3));;
			}
		System.out.println("data fetched");
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
