

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
public void service(HttpServletRequest request,HttpServletResponse response) 
{
String fn=request.getParameter("FN");
String un=request.getParameter("UN");
String passw=request.getParameter("PASS");
Model m=new Model();
m.setFullname(fn);
m.setUsername(un);
m.setPassword(passw);
boolean status=m.register();
if(status==true)
{
	try {
		response.sendRedirect("successRegister.html");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
else
{
	try {
		response.sendRedirect("failureRegister.html");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
}