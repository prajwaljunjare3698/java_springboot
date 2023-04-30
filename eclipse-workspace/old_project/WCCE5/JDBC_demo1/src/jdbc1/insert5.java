package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insert5 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con=DriverManager.getConnection(url,user,pass);
			String q="insert into std2 values(?,?,?)";
			
			PreparedStatement pr=con.prepareStatement(q);
						
			Scanner sc=new Scanner(System.in);
			while(true) {
				System.out.println("enter sid ");
				int sid=sc.nextInt();
				pr.setInt(1, sid);
				
				System.out.println("enter student name");
				String name=sc.next();
				pr.setString(2, name);
				
				System.out.println("enter student place");
				String place=sc.next();
				pr.setString(3, place);
				
				pr.executeUpdate();
				System.out.println("inserted successfully");
				System.out.println("want to insert again \"yes\" or \"no\"");
				String check=sc.next();
				if(check.equalsIgnoreCase("yes")) {
					continue;
				}
				else {
					System.out.println("done.....");
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
