
package JDBC_HandsOn;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;

import oracle.jdbc.driver.OracleDriver;

public class FetchDatafromDatabaseusingColumnName {

	static String name,bjsid;
	static int marks1,marks2,marks3;
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Connection con=null;
		Statement  stmt=null;
		ResultSet res=null;
		
    String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String user="system";
	String password="system";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver loaded this time also");
	con=DriverManager.getConnection(url, user, password);

	System.out.println("Connection establish");
	
	String s="SELECT * FROM STUDENT";
	stmt=con.createStatement();
	res=stmt.executeQuery(s);
	while(res.next()==true) {
		name=res.getString("name");
		bjsid=res.getString("bjsid");
		marks1=res.getInt("marks1");
		marks2=res.getInt("marks2");
		marks3=res.getInt("marks3");
		System.out.println(name+" "+bjsid+" "+marks1+" "+marks2+" "+marks3);
	}

	
	}

}
 







 