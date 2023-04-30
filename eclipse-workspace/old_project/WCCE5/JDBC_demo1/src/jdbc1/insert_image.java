package jdbc1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert_image {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/gallery";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="insert into images(pic) values(?)";
			PreparedStatement pr=con.prepareStatement(q);
			
			FileInputStream fis=new FileInputStream("C:\\Programming\\WEWM-5\\Projects\\a_images\\passport.jpeg");
			
			pr.setBinaryStream(1, fis,fis.available());
			pr.executeUpdate();
			System.out.println("image inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
