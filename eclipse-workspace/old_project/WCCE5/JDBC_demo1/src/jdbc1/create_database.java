package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class create_database {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q= "create database gallery";
			PreparedStatement pr=con.prepareStatement(q);
			
			pr.execute();
			System.out.println("database created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
