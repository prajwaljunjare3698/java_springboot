package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class retrive_records2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="select upper(sname) from std2";
			PreparedStatement pr=con.prepareStatement(q);
			
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
				Thread.sleep(100);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
