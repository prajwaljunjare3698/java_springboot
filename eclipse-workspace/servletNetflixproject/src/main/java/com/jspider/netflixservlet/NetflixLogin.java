package com.jspider.netflixservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NetflixLogin")
public class NetflixLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public NetflixLogin() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h2>Welcome to Netflix</h2>");

		writer.println("<body style=\"display:flex; background-color: rgb(24, 23, 23);\">\r\n"
				+ "    \r\n"
				+ "    <div style=\"background-image: url(\"C:\\Users\\kisho\\eclipse-workspace\\servletNetflixproject\\src\\main\\webapp\\image\\netflix.jpg\"); height: 800px;width: 1500px; background-repeat: no-repeat; background-size: cover;  \">\r\n"
				+ "   \r\n"
				+ "    <div style=\"display: flex; margin-left: 30px;margin-top: 20px;\">\r\n"
				+ "        <img src=\"../images/netflix-logo-png-2562.png\" height=\"50px\" width=\"130x\"  alt=\"\">\r\n"
				+ "    </div>\r\n"
				+ "    <div style=\"display: flex; height: 500px; width:460px; border:1px solid; margin-top: 50px; margin-left: 300px; display: flex;  background-color: black; opacity: 0.8;\">\r\n"
				+ "        \r\n"
				+ "        <div style=\"height: 300px; width:340px; margin-left: 68px; margin-top: 30px;\">\r\n"
				+ "\r\n"
				+ "            <h2 style=\"color: white;\">Sign In</h2>\r\n"
				+ "\r\n"
				+ "            <input style=\"background-color: gray;font-size: 15px; height: 40px;width: 320px; border: 1px solid; color: white;\" type=\"text\" name=\"\" placeholder=\"Email or phone number\"> \r\n"
				+ "            <br><br>\r\n"
				+ "            <input style=\"background-color: gray;font-size: 15px; height: 40px;width: 320px; border: 1px solid;\" type=\"password\" name=\"\" placeholder=\"password\"> <br>\r\n"
				+ "\r\n"
				+ "            <br>\r\n"
				+ "            <button style=\"background-color: red;color: white; height: 40px;width: 326px; border: 1px solid;font-size: 15px;\">Sign In</button> <br>\r\n"
				+ "            <br>\r\n"
				+ "            <label for=\"radio\"></label>\r\n"
				+ "            <input style=\"color: blue;\" type=\"checkbox\" name=\"radio\"><span style=\"color: white;\">Remember me</span>\r\n"
				+ "          \r\n"
				+ "          <span style=\"margin-left: 140px;\"><a style=\"text-decoration: none;color: white;\" href=\"#\">Need help?</a> </span> <br>\r\n"
				+ "\r\n"
				+ "            <br><br><br>\r\n"
				+ "            <span style=\"color:rgb(197, 179, 179)\">New to Netflix?</span> <span style=\"font-size: 18px; color: white;\">Sign up now.</span> <br>\r\n"
				+ "            <span style=\"color:rgb(197, 179, 179)\">This page is protected by Google reCAPTCHA to ensure you're not a bot.</span> <a href=\"#\" style=\"text-decoration: none; color:blue\">Learn more.</a>\r\n"
				+ "        \r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "</body>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
