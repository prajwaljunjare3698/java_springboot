package com.jspider.jdbcMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class AlloperationsByClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","tiger");
			PreparedStatement preparedStatement = connection.prepareStatement("show databases");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
			System.err.println("enete database name");
			String dbName = sc.next();
			System.out.println();
			
			preparedStatement = connection.prepareStatement("use "+dbName);
			preparedStatement.executeUpdate();
			
			preparedStatement = connection.prepareCall("show tables");
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
			System.err.println("enete table name");
			String tableName = sc.next();
			System.out.println();
			
			preparedStatement = connection.prepareCall("select * from "+tableName);
			resultSet = preparedStatement.executeQuery();
			
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			
			int count = resultSetMetaData.getColumnCount();
			
			System.out.println(count);
			
			while(resultSet.next()) {
				for(int i=1;i<=count;i++) {
					System.out.print(resultSet.getString(i)+" ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}
