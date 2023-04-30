package com.jspider.jdbc.propertiesPro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcUpdate {
	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static FileReader fileReader;
	private static Properties properties = new Properties();
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader = new FileReader("C:\\Users\\kisho\\eclipse-workspace\\Jdbc_properties\\resources\\db_info.properties");
			properties.load(fileReader);
			
			connection.createStatement();
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2",properties);
			statement = connection.createStatement();
			result = statement.executeUpdate("update student set sname='pqr' where sid=3");
			System.out.println(result+" rows affected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
				}
			}
		
		}
	}
}
