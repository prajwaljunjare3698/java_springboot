package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class temp1 extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		out.print("<h2> this is the "+name+"");
		
		//out.print("<a href='temp2?user="+name+"'>go to servlet 2</a>");
		
		out.print("<html>"
				+ "<body>"
				
				+ "<form action='temp2'method='post'>"
				+ "<input type='text' name='name' value='"+name+"' />"
				+ "<h2>this is best</h2>"
				+"<input type='submit'"
				+"</body>"
				+ "</form>"
				+"</html>");
		
		
	
	}
}
