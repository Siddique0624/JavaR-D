import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	Connection con=null;
	PreparedStatement pstmt=null;
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String pass="system";
	String user="system";
private String fullname;
private String username;
private String password;
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
Model()
{
	try {
		DriverManager.registerDriver(new OracleDriver());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		con=DriverManager.getConnection(url,user,pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public boolean register()
{
	String s="INSERT INTO REGISTER VALUES(?,?,?)";
		try {
			pstmt=con.prepareStatement(s);
			pstmt.setString(1, fullname);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			int res=pstmt.executeUpdate();
			if(res>0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
}
}
