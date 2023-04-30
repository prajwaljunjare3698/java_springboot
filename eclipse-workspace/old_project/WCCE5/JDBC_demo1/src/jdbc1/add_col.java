package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class add_col {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/stduent";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="alter table std2 add column 'sal' int ";
			PreparedStatement pr=con.prepareStatement(q);
			pr.executeUpdate();
			System.out.println("column added");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
