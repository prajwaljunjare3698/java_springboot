package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String user="root"; 
		String pass="tiger";
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String q="update std2 set sname=? where sid=?";
		
		PreparedStatement pr=con.prepareStatement(q);
		pr.setString(1, "akshya");
		pr.setInt(2,109);
		pr.executeUpdate();
		
		System.out.println("record updated");
	}
}
