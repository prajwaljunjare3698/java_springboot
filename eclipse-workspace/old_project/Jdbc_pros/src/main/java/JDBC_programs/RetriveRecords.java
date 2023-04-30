package JDBC_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveRecords {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/student";
			String user = "root";
			String pass = "tiger";
			Connection con = DriverManager.getConnection(url,user,pass);
			String query = "select * from first";
			PreparedStatement pr = con.prepareStatement(query);
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			System.out.println("data fetched successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
