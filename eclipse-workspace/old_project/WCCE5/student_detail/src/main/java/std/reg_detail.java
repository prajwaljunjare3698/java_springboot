package std;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reg_detail extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String mob = req.getParameter("phone");
		String email = req.getParameter("email");
		String gen = req.getParameter("gender");
		String place = req.getParameter("place");
		String course = req.getParameter("course");
		String check = req.getParameter("check");
		if(check!=null) {
			//out.println("<h2>name"+name+""+age+" "+mob+""+email+""+gen+""+place+""+course);
			try {
							
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/student";
				String user="root";
				String pass="tiger";
				Connection con=DriverManager.getConnection(url,user,pass);
				String q = "insert into qspider(name,age,phone,email,gender,place,course)"
							+ " values(?,?,?,?,?,?,?)";
										
				PreparedStatement pr1 = con.prepareStatement(q);
				pr1.setString(1, name);
				pr1.setString(2, age);
				pr1.setString(3, mob);
				pr1.setString(4, email);
				pr1.setString(5, gen);
				pr1.setString(6, place);
				pr1.setString(7, course);
				
				int i=pr1.executeUpdate();
	            if(i>0){
	                out.println("<h2>Registered successfully...</h2>");
	            }   
	            //show the saved data on current page
	            
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
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.println(e);
			}
		}
		else {
			out.print("<span style='color:red'>plz accept terms and conditions</span>");
			RequestDispatcher rd = req.getRequestDispatcher("home1.html"); 
			rd.include(req, res);
		}	
	}
}
