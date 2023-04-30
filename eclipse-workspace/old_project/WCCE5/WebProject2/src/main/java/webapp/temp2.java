package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class temp2 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");		
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		out.print("<h3>the previous name is "+name);
	}
}
