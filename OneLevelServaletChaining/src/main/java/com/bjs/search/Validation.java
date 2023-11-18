package com.bjs.search;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	 
	public void service(HttpServletRequest request, HttpServletResponse response)  {
	
		String usn=request.getParameter("USN");
		if(usn.length()!=9) {
			try {
				response.sendRedirect("error.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			 
		}
		else {
			try {
				request.getServletContext().getRequestDispatcher("/ToGetResult").forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

 