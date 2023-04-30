package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update4 {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="update std2 set sid=? where sname=?";
			PreparedStatement pr=con.prepareStatement(q);
			
			pr.setInt(1, 100);
			pr.setString(2, "akash");
			pr.execute();
			
			System.out.println("updated");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
