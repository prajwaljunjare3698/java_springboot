package com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Simple {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?username=root&password=tiger");
			PreparedStatement prepareStatement = connection.prepareStatement("select *from student");
			ResultSet resultSet = prepareStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
