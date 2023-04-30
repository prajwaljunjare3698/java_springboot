package JDBC_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/student";
			String user = "root";
			String pass = "tiger";
			Connection con = DriverManager.getConnection(url,user,pass);
			String query = "insert into first values(?,?,?,?)";
			PreparedStatement pr = con.prepareStatement(query);
			pr.setInt(1, 101);
			pr.setString(2, "abhishek");
			pr.setString(3, "testing");
			pr.setString(4, "pandharpur");
			pr.executeUpdate();
			System.out.println("data stored in db");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
