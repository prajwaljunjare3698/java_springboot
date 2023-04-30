package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculation extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("this is calculation servlet");
				
		String n1 = req.getParameter("no1");
		String n2 = req.getParameter("no2");
		
		int a = Integer.parseInt(n1);
		int b = Integer.parseInt(n2);
		
		int sum = a+b;
		out.println("<h2>the sum is "+sum);
		out.println("</h2>");
	}
}
