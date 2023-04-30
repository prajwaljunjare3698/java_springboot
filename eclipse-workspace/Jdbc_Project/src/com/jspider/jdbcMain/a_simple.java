package com.jspider.jdbcMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class a_simple {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			
			String q = "show tables";
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery(q);
			
			while(r.next()) {
				System.out.println(r.getString(1));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
