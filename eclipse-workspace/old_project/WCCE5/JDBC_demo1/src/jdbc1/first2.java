package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class first2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String username="root";
			String pass="tiger";
			Connection con = DriverManager.getConnection(url,username,pass);
			
			//con is create now write query
			String query="create table std2(sid int(20) primary key,sname varchar(20) not null,space varchar(14))";
			
			Statement st = con.createStatement();
			st.execute(query);
			System.out.println("table is created");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("table not created");			
		}
	}
}
