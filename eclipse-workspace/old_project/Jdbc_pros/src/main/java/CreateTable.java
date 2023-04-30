import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "root";
			String pass = "tiger";
			String url = "jdbc:mysql://localhost/student";
			Connection con = DriverManager.getConnection(url,user,pass);
			
			String query = "create table first(rollno int,name varchar(20))";
			Statement st = con.createStatement();
			st.execute(query);
			System.out.println("table created");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
