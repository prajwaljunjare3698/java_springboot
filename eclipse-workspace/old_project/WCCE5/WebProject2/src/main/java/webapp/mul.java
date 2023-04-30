package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class mul extends HttpServlet {
	public void doGet(ServletRequest req,ServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("this is mul ");
	}
}
