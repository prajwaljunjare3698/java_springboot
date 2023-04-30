package com.jspider.jdbcMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CreateInsert {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp?user=root&password=tiger");
			
			String queryTable = "create table student(id int(20), name varchar(20))";
			
			PreparedStatement preparedStatement1 = connection.prepareStatement(queryTable);
			int result = preparedStatement1.executeUpdate();
			
			System.out.println(result+"  table created");
			
			String queryInsert = "insert into student values(?,?)";
			preparedStatement1 = connection.prepareStatement(queryInsert);
			
			for(int i=1;i<=2;i++) {
				System.out.println("enter id");
				int id = sc.nextInt();
				
				System.out.println("enter name");
				String name = sc.next();
				
				preparedStatement1.setInt(1, id);
				preparedStatement1.setString(2, name);
				
				result = preparedStatement1.executeUpdate();
				System.err.println(result+" record inserted successfully...\n");
			}
			String querySelect = "select * from student";
			PreparedStatement preparedStatement2 = connection.prepareStatement(querySelect);
			ResultSet resultSet = preparedStatement2.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
			}
			System.err.println("data fetched successfully...");
			if(connection!=null & preparedStatement1!=null) {
				connection.close();
				preparedStatement1.close();
				resultSet.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
