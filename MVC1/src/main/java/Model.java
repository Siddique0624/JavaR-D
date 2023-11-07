import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	Connection con=null;
	ResultSet res=null;
	PreparedStatement pstmt=null;
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String user="system";
	String pass="system";
	
private String name;
private String usn;
private int marks1;
private int marks2;
private int marks3;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsn() {
	return usn;
}
public void setUsn(String usn) {
	this.usn = usn;
}
public int getMarks1() {
	return marks1;
}
public void setMarks1(int marks1) {
	this.marks1 = marks1;
}
public int getMarks2() {
	return marks2;
}
public void setMarks2(int marks2) {
	this.marks2 = marks2;
}
public int getMarks3() {
	return marks3;
}
public void setMarks3(int marks3) {
	this.marks3 = marks3;
}
public void connection() throws Exception
{
	DriverManager.registerDriver(new OracleDriver());
	con=DriverManager.getConnection(url,user,pass);
}

public boolean getResult()
{
	String s="SELECT * FROM STUDENT WHERE BJSID=?";
	try {
		pstmt=con.prepareStatement(s);
		pstmt.setString(1, usn);
		res=pstmt.executeQuery();
		if(res.next()==true)
		{
			 name=res.getString(1);
		
			 marks1=res.getInt(3);
			 marks2=res.getInt(4);
			 marks3=res.getInt(5);
			return true;
		}
		else
			return false;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}



}
