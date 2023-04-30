package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="delete from std2 where sid=?";
			PreparedStatement pr=con.prepareStatement(q);
			
			pr.setInt(1, 114);
			pr.executeUpdate();
			System.out.println("deleted");
			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
