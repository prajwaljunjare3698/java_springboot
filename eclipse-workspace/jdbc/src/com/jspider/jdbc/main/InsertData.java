package com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			
//			PreparedStatement ps = con.prepareStatement("insert into student values(2,'kuldeep','kuldeep12@gmail.com')");
//			ps.executeUpdate();
			
			Statement st = con.createStatement();
			int rs = st.executeUpdate("insert into student values(4,'abc','abc12@gmail.com')");
			
			System.out.println(rs+" rows are affected");
			
			System.out.println("data added");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
