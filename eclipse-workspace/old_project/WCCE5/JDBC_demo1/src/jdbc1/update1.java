package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			
			String q="ALTER TABLE std2 rename pace to place";
			Statement st = con.createStatement();
			st.execute(q);
			System.out.println("updated");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
