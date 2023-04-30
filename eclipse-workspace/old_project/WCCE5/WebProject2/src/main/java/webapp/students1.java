package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class students1 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		out.print(name);
		
		//storing the input in database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String user="root";
			String pass="tiger";
			Connection con = DriverManager.getConnection(url,user,pass);
			String q = "insert into qspider(name,age,phone,email) values(?,?,?,?) ";
		
			PreparedStatement pr = con.prepareStatement(q);
			pr.setString(1, name);
			pr.setInt(2, 22);
			pr.setInt(3,90909090);
			pr.setString(4, "abc@gmail.com");
			
			int i = pr.executeUpdate();
			if(i>0) {
				out.println("saved data");
			}
			
			String std_data = "select * from qspider";
            PreparedStatement pr2 = con.prepareStatement(std_data);
            ResultSet rs = pr2.executeQuery();
            
            out.println("<h3>students details</h3>");
            
            out.println("<table style=border:1px solid font-size:18px>");
            while(rs.next()) {
            	out.println(
            			"<tr>"
            			+"<td>"+rs.getInt(1)+"</td>"
            			+"<td>"+rs.getString(2)+"</td>"
            			+"<td>"+rs.getString(3)+"</td>"
            			+"<td>"+rs.getString(4)+"</td>"
            			+"<td>"+rs.getString(5)+"</td>"
            			+"<td>"+rs.getString(6)+"</td>"
            			+"<td>"+rs.getString(7)+"</td>"
            			+"<td>"+rs.getString(8)+"</td>"
            			+"</tr>");
            }       
            out.println("</table>");
            
            out.println("<h3>data fetched successfully</h3>");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
