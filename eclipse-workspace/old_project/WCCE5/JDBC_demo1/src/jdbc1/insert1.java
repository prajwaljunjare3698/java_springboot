package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert1 {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con = DriverManager.getConnection(url,user,pass);
			
			String q = "insert into std2(sid,sname,space) values(?,?,?)";
			//get preparedstatement obj
			PreparedStatement ps = con.prepareStatement(q);
			
			// set values to query
			ps.setInt(1, 1);
			ps.setString(2, "akash");
			ps.setString(3, "lonar");
			
			ps.executeUpdate();
			System.out.println("values are updated");
			
			con.close();
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
	}
}
