package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class jd_fetch {

@Test
public void fetch_jd() throws SQLException
{
	String url="jdbc:mysql://localhost:3306/tests?user=root&password=root";
	String un="root";
	String pwd="root";
	
	Connection con=DriverManager.getConnection(url,un,pwd);
	Statement stat=con.createStatement();
	ResultSet result = stat.executeQuery("select * from data");
	while(result.next())
	{
		String username=result.getString(1);
		String password=result.getString(2);
		System.out.println(username+"  "+password);
	}
}
}
