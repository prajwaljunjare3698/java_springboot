package com.jspider.standard.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	private static Connection connection;
	private static Statement statement;
	private static int result;
	
	private static String name = "rushi";
	private static String email = "rushi123@gmail.com";
	private static String course = "java";
	private static String place = "jalgao";
	
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp?user=root&password=tiger");
			statement = connection.createStatement();
			//result = statement.executeUpdate("update studentdetail set name="+"\""+name+"\""+","+"email="+"\""+email+"\""+","+"course="+"\""+course+"\""+","+"place="+"\""+place+"\""+" where id=14");
			
			
			//result = statement.executeUpdate("update studentdetail set name='+""+name+""+' where id=14");
			 
			
			System.out.println(result+" rows affected...");
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
