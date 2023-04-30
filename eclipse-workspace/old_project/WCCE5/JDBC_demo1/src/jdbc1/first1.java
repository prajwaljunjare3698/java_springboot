package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class first1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","tiger");
			System.out.println("conn created");
			if(con.isClosed()) {
				System.out.println("connection is closed");
			}
			else {
				System.out.println("connection is open");
			}
//			String query="create table std1(rollno int,name varchar(20))";
//			Statement st = con.createStatement();//to run query
//			
//			System.out.println("statement created");
//			st.execute(query);	
//			System.out.println("table created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
