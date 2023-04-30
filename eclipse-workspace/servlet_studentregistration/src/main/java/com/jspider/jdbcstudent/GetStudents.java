package com.jspider.jdbcstudent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getstudentdata")
public class GetStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection connection;
	private static PreparedStatement preparedStatement;
    
	public GetStudents() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String contact = request.getParameter("contact");
		String course = request.getParameter("course");
		String place = request.getParameter("place");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","tiger");
			String query = "insert into studentdetail(name,email,contact,course,place,password,gender) values(?,?,?,?,?,?,?)";
			
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email); 
			preparedStatement.setString(3, contact);
			preparedStatement.setString(4, course);
			preparedStatement.setString(5, place);
			preparedStatement.setString(6, password);
			preparedStatement.setString(7, gender);			
			
			preparedStatement.executeUpdate();
			writer.println("<h2>"+name+" record saved...</h2>");					
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		if(connection!=null && preparedStatement!=null) {				
			try {
				connection.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace(); 
			}		
		}				
	}
}
