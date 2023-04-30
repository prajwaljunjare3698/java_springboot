package com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			
			Statement st = con.createStatement();
			int rs = st.executeUpdate("update studentdto set name="+ '"'+"sanket"+'"' +" where id="+"1");
			System.out.println(rs+" rows affected");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
	}
}
