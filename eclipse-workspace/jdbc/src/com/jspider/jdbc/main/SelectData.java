package com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			PreparedStatement preparedStatement = connection.prepareStatement("select name from studentdto");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println('"'+resultSet.getString(1)+'"');
			}		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i==1 || i==5) {
//					System.out.print("*");
//				}
//				else if(j==1 || j==5) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
	}
}
