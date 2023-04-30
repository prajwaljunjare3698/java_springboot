package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class modify_column {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/gallery";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			//change datatype from blob to longblob for large images
			String q="alter table images modify pic longblob";
			PreparedStatement pr=con.prepareStatement(q);
			
			pr.execute();
			System.out.println("column altered");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
