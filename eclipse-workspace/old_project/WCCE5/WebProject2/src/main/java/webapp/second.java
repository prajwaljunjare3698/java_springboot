package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class second extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		System.out.println("this is doget method of HttpServlet");
		res.setContentType("text.html");
		
		PrintWriter out = res.getWriter();
		out.println("<h1>this is get method </h1>");
		out.println(new Date().toString());
	}
	
}
