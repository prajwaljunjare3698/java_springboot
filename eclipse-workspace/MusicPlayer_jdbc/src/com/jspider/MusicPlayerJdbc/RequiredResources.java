package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class RequiredResources {

	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
		
	public static Connection connection;
	public static Statement statement;
	public static PreparedStatement preparedStatement;
	public static ResultSet resultSet;
	public static CallableStatement callableStatement;
	public static FileReader fileReader;
	public static Properties properties = new Properties();
	public static String filePath = "D:\\workspace\\eclipse-workspace\\MusicPlayer_jdbc\\resources\\db_info.properties";
	public static Scanner scanner = new Scanner(System.in);
	
	
}
