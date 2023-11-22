


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PrintPercentage
 */

public class PrintPercentage extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		HttpSession session=request.getSession();
		int m1=(int) session.getAttribute("MARKS1");
		int m2=(int) session.getAttribute("MARKS2");
		int m3=(int) session.getAttribute("MARKS3");
		Integer i1=new Integer(m1);
		Integer i2=new Integer(m2);
		Integer i3=new Integer(m3);
		
		String s1=i1.toString();
		String s2=i2.toString();
		String s3=i3.toString();
		
		Cookie ck1=new Cookie("CK1",s1);
		Cookie ck2=new Cookie("CK2",s2);
		Cookie ck3=new Cookie("CK3",s3);
		
		ck1.setMaxAge(1*24*60*60);
		ck1.setMaxAge(1*24*60*60);
		ck1.setMaxAge(1*24*60*60);
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		
		float per=((m1+m2+m3)/300f)*100;
		PrintWriter pw=response.getWriter();
		pw.println("the percentage is "+per);

		
	}
}