package jdbc1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert_image1 {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/gallery";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="insert into images(pic) value(?)";
			PreparedStatement pr=con.prepareStatement(q);
			FileInputStream fis=new FileInputStream("C:\\Programming\\WEWM-5\\Projects\\a_images\\fantasy-4544929_1920.jpg");
			
			pr.setBinaryStream(1, fis,fis.available());
			pr.executeUpdate();
			System.out.println("image inserted");
			//image will show in no,letter format...
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
