package com.jspider.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DynamicQuery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/task?user=root&password=tiger");
			
			String query1 = "insert into student values(?,?,?)";
			PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enterrecord");
			
			for(int i=1;i<=3;i++) {
				System.out.println("enter id,name & email");
				int id = sc.nextInt();
				String name = sc.next();
				String email = sc.next();
				
				preparedStatement1.setInt(1,id);
				preparedStatement1.setString(2, name);
				preparedStatement1.setString(3, email);
				
				preparedStatement1.executeUpdate();
				System.out.println("record inserted");
			}
			String query2 = "select * from student";
			PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
			ResultSet resultSet = preparedStatement2.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
