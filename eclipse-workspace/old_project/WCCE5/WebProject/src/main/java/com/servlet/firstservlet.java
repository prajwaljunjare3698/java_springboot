package com.servlet;
import java.io.IOException;

import javax.servlet.*;

public class firstservlet implements Servlet{
	
	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("create servlet");
	}
	
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		System.out.println("servicing...");
	}
	public void destroy() {
		System.out.println("going to destroy");
	}
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	public String getServletInfo() {
		return "this servlet creted by Prajwal"; 
	}
}
