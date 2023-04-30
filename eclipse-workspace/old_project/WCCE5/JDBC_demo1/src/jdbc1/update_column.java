package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update_column {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="alter table std2 rename column place to splace";
			PreparedStatement pr=con.prepareStatement(q);
			
			//pr.setString(2, "place");
			
			pr.executeUpdate();
			System.out.println("col name changed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
