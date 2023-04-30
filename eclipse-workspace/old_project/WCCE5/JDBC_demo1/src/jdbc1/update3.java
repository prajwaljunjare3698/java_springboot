package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class update3 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="update std2 set sname=?,splace=? where sid=?";
			PreparedStatement pr=con.prepareStatement(q);
			
			System.out.println("enter updated name");
			String name=sc.next();
			pr.setString(1, name);
			
			System.out.println("enter updated place");
			String place=sc.next();
			pr.setString(2, place);
			
			System.out.println("enter sid you want to update");
			int sid=sc.nextInt();
			pr.setInt(3, sid);
			
			pr.executeUpdate();
			System.out.println("record updated");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
