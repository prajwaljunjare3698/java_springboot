package com.jspider.standard.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;
	
	public static void main(String[] args) {
		
		System.out.println("\""+"prajwal"+"\"");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=tiger");
			statement = connection.createStatement();
			
//			String s = "\\G";
//			String s1 = s.charAt(0)+""+s.charAt(1);
//			System.out.println(s1);
//			resultset = statement.executeQuery("select * from qspider "+s1+";");
//			
//			not getting output.....
			
			resultset = statement.executeQuery("select * from qspider where sid = 1");
			resultset.next();
			System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+" "+resultset.getString(4)+" "+resultset.getString(5)+" "+resultset.getString(6)+" "+resultset.getString(7));
			
			int row = 0;
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
				row++;
			}
			System.out.println("\n"+"\t"+row+" record fetched successfully");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
