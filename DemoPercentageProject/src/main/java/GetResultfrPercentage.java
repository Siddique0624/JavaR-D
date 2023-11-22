

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.jdbc.driver.OracleDriver;


public class GetResultfrPercentage extends HttpServlet {
	Connection con=null;
	ResultSet res=null;
	PreparedStatement pstmt=null;
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String user="system";
	String password="system";
public void init()
{
	try {
		DriverManager.registerDriver(new OracleDriver());
		System.out.println("loaded");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		con=DriverManager.getConnection(url, user, password);
		System.out.println("connected");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
{
	String usn=request.getParameter("USN");
	String s="SELECT * FROM STUDENT WHERE BJSID=?";
	try {
		pstmt=con.prepareStatement(s);
		pstmt.setString(1, usn);
		res=pstmt.executeQuery();
		System.out.println("fetched");
		if(res.next()==true)
		{
			String name=res.getString(1);
int m1=res.getInt(3);int m2=res.getInt(4);int m3=res.getInt(5);
		System.out.println(name+" "+usn+" "+m1+" "+m2+" "+m3);
		PrintWriter pw=response.getWriter();
		pw.println(name+" "+usn+" "+m1+" "+m2+" "+m3);
		HttpSession session=request.getSession(true);
		session.setAttribute("MARKS1", m1);
		session.setAttribute("MARKS2", m2);
		session.setAttribute("MARKS3", m3);
request.getServletContext().getRequestDispatcher("/PrintPercentage")
.include(request, response);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void destroy()
{
	try {
		con.close();
		pstmt.close();
		res.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}