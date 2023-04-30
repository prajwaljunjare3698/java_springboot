package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fetch_data {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="select * from std2";
			PreparedStatement pr=con.prepareStatement(q);
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				Thread.sleep(200);
			}
			
			//pr.execute();
			System.out.println("fetched");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
