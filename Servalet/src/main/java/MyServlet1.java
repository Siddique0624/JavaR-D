

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	 
	public void  service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.sendRedirect("welcome.html");
	}

}
