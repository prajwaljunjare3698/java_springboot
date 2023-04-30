package com.jspider.jdbcMain;

import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class DatabaseProperties {
	public static Connection connection;
	public static Statement statement;
	public static PreparedStatement preparedStatement;
	public static ResultSet resultSet;
	public static CallableStatement callableStatement;
	public static FileReader fileReader;
	public static String filePath = "C:\\Users\\kisho\\eclipse-workspace\\Jdbc_Project\\resources\\db_info.properties";
	public static Properties properties = new Properties();
	public static Scanner scanner = new Scanner(System.in);

}



