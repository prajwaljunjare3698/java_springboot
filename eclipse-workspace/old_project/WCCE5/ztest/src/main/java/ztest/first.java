package ztest;
import java.io.IOException;

import javax.servlet.*;
public class first implements Servlet{
	ServletConfig conf;
	public void init(ServletConfig conf) {
		System.out.println("started");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
		System.out.println("services");
	}
	public void destroy() {
		System.out.println("closed");
	}
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	public String getServletInfo() {
		return "end";
	}
	
}
