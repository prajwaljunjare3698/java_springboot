package com.jspider.servletmusic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servletmusicplayer")
public class ServletMusicPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletMusicPlayer() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/htm");
		PrintWriter writer = response.getWriter();
		
		
	
	}

}
