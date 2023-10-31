

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Without_html
 * Servlet implementation class Without_html
 * Servlet implementation class Without_html
 * Servlet implementation class Without_html
 * Servlet implementation class Without_html
 */
@WebServlet("/Without_html")
public class Without_html extends HttpServlet {
	 
	public void  service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter pw=response.getWriter();
	pw.println("<html>");	
	pw.println("<head>");	
	pw.println("<meta charset=\"ISO-8859-1\">");	
	pw.println("<title>Insert title here</title>");	
	pw.println("</head>");	
	pw.println("<body>");	
	pw.println("<h2>welcome to JavaWorld without html files</h2>");	
	pw.println("</body>");
	pw.println("</html>");
	}
}

