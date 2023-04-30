package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class database {
	public static void main(String[] args) {
		try {
			System.out.println("starting");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			
			String q="select * from std2";
			PreparedStatement pr=con.prepareStatement(q);
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+"-"+rs.getString(3));
			}
			System.out.println("data fetch successully");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
