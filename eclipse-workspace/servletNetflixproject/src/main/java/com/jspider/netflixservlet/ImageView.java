package com.jspider.netflixservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImageView")
public class ImageView extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ImageView() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<style>img{background-image:url(\"./netflix.jpg\");width:100%; height:100vh;}</style>");
	    writer.println("<body>");
	        
	    writer.println("<img>");
	    
	    writer.println("</body>");
	    writer.println("</html>");
	    		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
