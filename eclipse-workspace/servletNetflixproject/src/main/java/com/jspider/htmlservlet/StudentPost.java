package com.jspider.htmlservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/stdregpost")
public class StudentPost extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    public StudentPost() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		writer.println("<h2> hello "+fullName+" have a nice day </h2>");
		writer.println("<h2>"+email+" </h2>");
		writer.println("<h2>"+password+"</h2>");
	}

}
