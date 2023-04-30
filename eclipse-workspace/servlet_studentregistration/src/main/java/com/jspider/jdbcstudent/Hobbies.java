package com.jspider.jdbcstudent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hobbies
 */
@WebServlet("/hobbies")
public class Hobbies extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public Hobbies() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String[] hobbies = request.getParameterValues("hobby");
		
		for(String hobby:hobbies) {
			writer.println(hobby+"<br>");
		}
	}

}
