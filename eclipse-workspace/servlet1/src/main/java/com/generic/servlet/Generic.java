package com.generic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<head><title>My first Servlet</title></head>");
        pw.println("<body>");
        pw.println("<h2>Welcome To Servlet World!</h2>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
		
	}
	
}
