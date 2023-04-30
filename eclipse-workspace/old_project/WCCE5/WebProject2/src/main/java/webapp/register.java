package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("created");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>the webpage created</h2>");
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String gen = req.getParameter("gender");
		String course = req.getParameter("course");
		String place = req.getParameter("place");
		 
		String con = req.getParameter("agree");
		if(con!=null) {
			if(con.equals("check")) {
				out.println("<h2>name is "+name);
				out.println("<h2>password is "+pass);
				out.println("<h2>gender "+gen);
				out.println("<h2>course "+course);
				out.println("<h2>place "+place);
			}
			else {
				out.println("<h2>you have not checked terms and condn</h2>");
			}
		}	
		else {
			out.println("<h2>you have not checked terms and condn</h2>");
		}
	}
}
