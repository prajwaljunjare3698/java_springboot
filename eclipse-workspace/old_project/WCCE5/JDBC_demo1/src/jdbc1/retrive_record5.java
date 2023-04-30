package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class retrive_record5 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="select * from std2 where sname=?";
			PreparedStatement pr=con.prepareStatement(q);
			pr.setString(1, "akash");
			pr.execute();
			System.out.println("fetched");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
