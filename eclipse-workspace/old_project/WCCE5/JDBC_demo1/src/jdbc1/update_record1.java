package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update_record1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="update std2 set sid=110 where place=lonar";
			PreparedStatement pr=con.prepareStatement(q);

			pr.executeUpdate();
			System.out.println("record updted");
		}
		catch(Throwable i) {
			System.out.println(i);
		}
	}
}
