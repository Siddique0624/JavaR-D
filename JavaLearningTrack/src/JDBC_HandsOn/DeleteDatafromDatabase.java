package JDBC_HandsOn;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;

import oracle.jdbc.driver.OracleDriver;

public class DeleteDatafromDatabase {

	static String name,bjsid;
	static int marks1,marks2,marks3;
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Connection con=null;
		Statement  stmt=null;
		ResultSet res=null;
		PreparedStatement pstmt=null;
		
    String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String user="system";
	String password="system";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver loaded this time also");
	con=DriverManager.getConnection(url, user, password);

	System.out.println("Connection establish");
	Scanner   scan=new Scanner(System.in);
	 
	System.out.println("Enter the register no of candidate");
	String bjsid=scan.nextLine();
	 
      

 	String s=" DELETE FROM STUDENT WHERE BJSID=?";
	pstmt=con.prepareStatement(s);
	pstmt.setString(1,bjsid);
	int val =pstmt.executeUpdate();
	if(val>0) {

System.out.println("Sucessfully Deleted   "+val+" row from table");

	}
	else
	{

System.out.println("failed to delete the data");

	}
	}

}
 
 
 