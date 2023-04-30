package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class retrive_records3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
//			String q="select sid,sname from std2 where mod(sid,2)=0";
//			String q="select max(sid),sname form std2";
			String q="select ";
			PreparedStatement pr=con.prepareStatement(q);
			ResultSet rs=pr.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}	
