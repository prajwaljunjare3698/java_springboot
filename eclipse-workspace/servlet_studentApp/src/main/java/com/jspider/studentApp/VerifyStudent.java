package com.jspider.studentApp;

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

@WebServlet("/verify")
public class VerifyStudent extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static Connection connection;
	private static PreparedStatement preparedStatement1,preparedStatement2;
	private static ResultSet resultSet1;
	private static ResultSet resultSet2;

	private static boolean flag = false;
	public VerifyStudent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","tiger");
			String query1 = "select username,password from std_user_pass";
			
			preparedStatement1 = connection.prepareStatement(query1);			
			
			resultSet1 = preparedStatement1.executeQuery();
			while(resultSet1.next()) {
				if(username.equals(resultSet1.getString(1)) && password.equals(resultSet1.getString(2))){
					writer.println("<h2>wellcome to your page</h2>");
					flag=true;
					break;
				}
			}
			if(flag==true) {
				String query2 = "select * from studentdetail where username="+"\'"+username+"\'";;
				preparedStatement2 = connection.prepareStatement(query2);
				resultSet2 = preparedStatement2.executeQuery();
				while(resultSet2.next()) {
					writer.println(resultSet2.getString(1)+" "+resultSet2.getString(2)+" "+resultSet2.getString(3)
					+" "+resultSet2.getString(4)+" "+resultSet2.getString(5)+" "+resultSet2.getString(6)
					+" "+resultSet2.getString(7)+" "+resultSet2.getString(8)+" "+resultSet2.getString(9));
					
					writer.println("<h2>"+username+" data fetched successfully...</h2>");
				}			
			}
			else {
				writer.println("<h3>username or password is not write</h3>");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		if(connection!=null && preparedStatement1!=null) {				
			try {
				connection.close();
				preparedStatement1.close();
			} catch (SQLException e) {
				e.printStackTrace(); 
			}		
		}				
		
	}

}
