package JDBC_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/student";
			String user = "root";
			String pass = "tiger";
			Connection con = DriverManager.getConnection(url,user,pass);
			String query = "insert into first values(?,?,?,?)";
			PreparedStatement pr = con.prepareStatement(query);
			pr.setInt(1, 102);
			pr.setString(2, "kedar");
			pr.setString(3, "mechanical");
			pr.setString(4, "sangli");
			pr.executeUpdate();
			System.out.println("record inserted into table");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
