package com.jspider.jdbcstudent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/retrieve")
public class RetrieveStudent extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	private static Connection connection;
	private static PreparedStatement preparedStatement;
    
    public RetrieveStudent() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","tiger");
			String query = "select * from studentdetail";
			
			preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
		
			writer.println("<h2>id name  &nbsp&nbsp&nbsp&nbsp   email          contact  course   place    gender</h2>");
			while(rs.next()) {
				writer.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
					+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+"<br>");

			}			
			writer.println("<h3>records fetched successfully...</h3>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		finally {
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
}
