package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class first extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>this is one way to create servlet </h1>");
		
	}
}
