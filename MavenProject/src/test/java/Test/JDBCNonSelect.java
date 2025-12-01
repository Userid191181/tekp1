package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCNonSelect {

	public static void main(String[] args) throws SQLException {
//		Step1: load/register db driver
//		We have class called DriverManager, it is coming from java.sql package
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref); //Registration is Done. registerDriver is a static method.
		//To connect to mySQLDB, we nned to load or Register the Driver, the driver is mysqlDriver 
//	Step2: connect to db
	Connection con=	DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm", "root@%", "root"); //Again we use DriverManager to get connection. getConnection is alos static method available in DriverManager class.
		//Whenever we use getConnection method it asks for URL:
		//This getConnection has 3 args getConnection("url", "username", "password")
		//to provide url info,  we need to know in below syntax.
		//Syntax: Starts with "JDBC:mysql://localhost:port/projects"
		//Return type of the getConnection is "Connection".
//	Step3: create sql statement 
	Statement state=con.createStatement();
//	Step4: execute insert into query
	// execute Update returns + or -. + menas true - means false //Project ID and Project name should be unique.
	int abc=state.executeUpdate("insert into project values('Project_2025_15', 'Naresh2', '30/09/2025', 'ProjectT28','Created', 12)");
System.out.println(abc);
//Step5: close the connection
con.close();
//After executing this query it has returned 1.
	}

}
