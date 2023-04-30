package JDBC_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveRecords1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=tiger");
			
			PreparedStatement st = con.prepareStatement("select * from qspider");
			ResultSet rs = st.executeQuery();
			
			System.err.print("S_Id"+" "+"S_name"+" "+"S_age \n" );
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
