package com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			
			Statement st = connection.createStatement();
			int result = st.executeUpdate("delete from student where sid=4");
			System.out.println(result+" rows affected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
