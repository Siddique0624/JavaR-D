package JDBC_HandsOn;



import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet; 

import oracle.jdbc.driver.OracleDriver;

public class InsertDatainDatabase {

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
	System.out.println("Enter the name");	
	String name=scan.nextLine();
	System.out.println("Enter the register no of candidate");
	String bjsid=scan.nextLine();
	System.out.println("Enter the marks1");
int marks1=scan.nextInt();
System.out.println("Enter the marks2");
int marks2=scan.nextInt();
System.out.println("Enter the marks3");
int marks3=scan.nextInt();

 	String s="INSERT INTO STUDENT VALUES (?,?,?,?,?)";
	pstmt=con.prepareStatement(s);
	pstmt.setString(1,name);
	pstmt.setString(2,bjsid);
	pstmt.setInt(3,marks1);
	pstmt.setInt(4,marks2);
	pstmt.setInt(5,marks3);
	
	int val =pstmt.executeUpdate();
	if(val>0) {

System.out.println("Sucessfully added "+val+" row into table");

	}
	else
	{

System.out.println("failed to insert the data");

	}
	}

}
 