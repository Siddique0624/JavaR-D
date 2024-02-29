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

public class ResultFetchingffromDatabase {

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
	

	System.out.println("Enter the register no of candidate whose data has yo be fetched");
	Scanner   scan=new Scanner(System.in);
	
	String regno=scan.nextLine();
	String s="SELECT * FROM STUDENT WHERE BJSID=?";
	pstmt=con.prepareStatement(s);
	pstmt.setString(1,regno);
	res=pstmt.executeQuery();
	if(res.next()==true) {
		name=res.getString(1);
		bjsid=res.getString(2);
		marks1=res.getInt(3);
		marks2=res.getInt(4);
		marks3=res.getInt(5);
		System.out.println(name+" "+bjsid+" "+marks1+" "+marks2+" "+marks3);
	}

	
	}

}
 


 