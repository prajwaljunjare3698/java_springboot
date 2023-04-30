package com.jspider.studentApp;

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

@WebServlet("/getstudent")
public class GetStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection connection;
	private static PreparedStatement preparedStatement1, preparedStatement2;
    
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String contact = request.getParameter("contact");
		String course = request.getParameter("course");
		String place = request.getParameter("place");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","tiger");
			String query1 = "insert into studentdetail(name,username,password,email,contact,course,place,gender) values(?,?,?,?,?,?,?,?)";
			String query2 = "insert into std_user_pass values(?,?)";
			
			preparedStatement1 = connection.prepareStatement(query1);
			preparedStatement2 = connection.prepareStatement(query2);
			
			// inerting record in studentdetail table
			
			preparedStatement1.setString(1, name);
			preparedStatement1.setString(2, username);			
			preparedStatement1.setString(3, password); 
			preparedStatement1.setString(4, email);
			preparedStatement1.setString(5, contact);
			preparedStatement1.setString(6, course);
			preparedStatement1.setString(7, place);
			preparedStatement1.setString(8, gender);		
			
			// inserting username and password in std_user_pass table for 
			// furture student accessing purpose...
			
			preparedStatement2.setString(1, username);
			preparedStatement2.setString(2, password);
			
			//saving both inserted record in both tables...
			
			preparedStatement1.executeUpdate();
			preparedStatement2.executeUpdate();
			
			
			writer.println("<h2>"+name+" record saved...</h2>");	
			
			
			writer.println("<a href=\"./verify.html\">Sign In</a>");
			writer.println("<a href=\"./getstudent1.html\">Sign Up</a>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		if(connection!=null && preparedStatement1!=null && preparedStatement2!=null) {				
			try {
				
				connection.close();
				preparedStatement1.close();
				preparedStatement2.close();
				
			} catch (SQLException e) {
				e.printStackTrace(); 
			}		
		}				
	}
}
