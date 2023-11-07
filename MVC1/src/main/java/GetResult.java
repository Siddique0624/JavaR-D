

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetResult
 */
public class GetResult extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		Model m=new Model();
		try {
			m.connection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String usn=request.getParameter("USN");
		m.setUsn(usn);
		boolean status=m.getResult();
		if(status==true)
		{
		HttpSession session=request.getSession(true);
		String name=m.getName();
		int m1=m.getMarks1();
		int m2=m.getMarks2();
		int m3=m.getMarks3();
		session.setAttribute("NAME", name);
		session.setAttribute("USN", usn);
		session.setAttribute("MARKS1", m1);
		session.setAttribute("MARKS2", m2);
		session.setAttribute("MARKS3", m3);
		response.sendRedirect("disp.jsp");
		}
		else
		{
			response.sendRedirect("error.html");
		}
	}
}
