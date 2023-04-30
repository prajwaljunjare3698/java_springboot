package com.jspider.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","tiger");
			PreparedStatement prepareStatement = connection.prepareStatement("select *from studentdetail");
			ResultSet resultSet = prepareStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
