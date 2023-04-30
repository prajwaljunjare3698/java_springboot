package webapp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class add extends HttpServlet {
	
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		
		int k = i+j;
		
		PrintWriter out = res.getWriter();
		out.println("result is "+k);
	}
	
}
