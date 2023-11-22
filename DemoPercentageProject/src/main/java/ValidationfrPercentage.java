

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Val
 */
public class ValidationfrPercentage extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
String usn=	request.getParameter("USN");
if(usn.length()!=9)
	response.sendRedirect("error.html");
else
	request.getServletContext().getRequestDispatcher("/GetResult").forward(request, response);
	}

	}