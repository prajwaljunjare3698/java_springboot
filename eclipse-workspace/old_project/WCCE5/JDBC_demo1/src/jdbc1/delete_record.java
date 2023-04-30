package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete_record {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			
			PreparedStatement stmt=con.prepareStatement("delete from std2 where sid=?");  
			stmt.setInt(1,110);  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted");  
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
