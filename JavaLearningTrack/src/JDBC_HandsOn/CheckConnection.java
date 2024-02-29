package JDBC_HandsOn;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 import oracle.jdbc.driver.OracleDriver;

public class CheckConnection {

	public static void main(String[] args) throws Exception  {
		
		Connection con=null;
		// TODO Auto-generated method stub
    String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String user="system";
	String password="system";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver loaded this time also");
	DriverManager.getConnection(url, user, password);

	System.out.println("Connection establish");
	/*	DriverManager.registerDriver(new OracleDriver());
		System.out.println("Driver has been loaded");
	*/
	
	}

}
