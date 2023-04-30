package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			
			String Query="insert into std2 values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(Query);
			
			ps.setInt(1, 102);
			ps.setString(2, "ajay");
			ps.setString(3, "varud");
			
			int i=ps.executeUpdate();
			System.out.println(i+" records inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
