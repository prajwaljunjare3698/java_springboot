package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			
			String q="insert into std2 values(?,?,?)";
			PreparedStatement pr=con.prepareStatement(q);
			pr.setInt(1, 112);
			pr.setString(2, "abhishek");
			pr.setString(3,"akot");
			
			pr.executeUpdate();
			System.out.println("data inserted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
