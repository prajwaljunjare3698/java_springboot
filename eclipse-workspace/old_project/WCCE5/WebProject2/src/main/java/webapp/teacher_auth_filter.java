package webapp;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

public class teacher_auth_filter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession s = req.getSession();
		
		User user = (User)s.getAttribute("user");
		if(user!=null && user.getUsername().equals("teacher")){
			//login
			chain.doFilter(request, response);
		}
		else {
			//for show in console
			System.out.println("not logged in plx log in");
			
			//for show in webpage
			response.setContentType("text/html");
			response.getWriter().print("<h3>not logged in</h3>");
		}
		
		
	}

}
