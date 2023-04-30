package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register1 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException{
		System.out.println("this is post method");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h2>this is post method</h2>");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String email = req.getParameter("email");
		String gen = req.getParameter("gender");
		String place = req.getParameter("place");
		String course = req.getParameter("course");
		String check = req.getParameter("check");
		
		if(check!=null) {
			out.println("<h3>name is "+name+"</h3>");
			out.println("<h3>password is "+pass+"</h3>");
			out.println("<h3>email is "+email+"</h3>");
			out.println("<h3>gender is "+gen+"</h3>");
			out.println("<h3>place is "+place+"</h3>");
			out.println("<h3>course is "+course+"</h3>");
			
			//consider save data on database
			//send client for confirmation
			
			//create new servlet to show response
			RequestDispatcher rd = req.getRequestDispatcher("success_register1");
			rd.forward(req, res);	
		}
		else {
			out.println("<h3>you have not accept term and conditions</h3>");
			
			//to get again that html form get object of RequestDispatcher
			
			RequestDispatcher rd = req.getRequestDispatcher("form1.html"); 
			rd.include(req, res);
		}
	}
}
