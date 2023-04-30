package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="tiger";
		Connection con=DriverManager.getConnection(url,user,pass);
		
		String q="insert into std2 values(?,?,?)";
		PreparedStatement pr=con.prepareStatement(q);
		
		pr.setInt(1, 110);
		pr.setString(2,"rushi");
		pr.setString(3,"dhule");
		
		pr.executeUpdate();
		System.out.println("data inserted");
		
	}
}
