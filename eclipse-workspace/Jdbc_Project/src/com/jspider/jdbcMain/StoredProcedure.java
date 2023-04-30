package com.jspider.jdbcMain;

import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

public class StoredProcedure {
	private static Connection connection;
	private static CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static String query;
	private static Properties properties = new Properties();
	private static String filePath = "C:\\Users\\kisho\\eclipse-workspace\\Jdbc_Project\\resources\\db_info.properties";
	
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader(filePath);
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection(properties.getProperty("db_url"),properties);
			query = "call pro1()";
			
			callableStatement = connection.prepareCall(query);
			resultSet = callableStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
