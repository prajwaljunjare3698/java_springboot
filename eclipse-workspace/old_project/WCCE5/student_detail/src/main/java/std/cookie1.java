package std;

import java.io.IOException;
import java.io.PrintWriter;

public class cookie1 extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		out.println("<h2>hi "+name+" this is servlet-1</h2>");
		out.println("<a href='cookie2?user="+name+"'>click to servlet 2");
		
	}
}
