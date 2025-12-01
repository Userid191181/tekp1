package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_1 {

	public static void main(String[] args) throws SQLException {
//		Step1: load/register db driver
//		We have class called DriverManager, it is coming from java.sql package
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref); //Registration is Done. registerDriver is a static method.
		//To connect to mySQLDB, we need to load or Register the Driver, the driver is mysqlDriver 
//	Step2: connect to db
	Connection con=	DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm", "root@%", "root"); //Again we use DriverManager to get connection. getConnection is alos static method available in DriverManager class.
		//Whenever we use getConnection method it asks for URL:
		//This getConnection has 3 args getConnection("url", "username", "password")
		//to provide url info,  we need to know in below syntax.
		//Syntax: Starts with "JDBC:mysql://localhost:port/projects"
		//Return type of the getConnection is "Connection".
//	Step3: create sql statement 
	Statement state=con.createStatement();
//	Step4: execute select query and get result
	ResultSet resset=state.executeQuery("select * from project"); //data stored in resset
	 //cursor.next() . This is one of the cursor available in Java, if anybody wants to capture the data from As-set we use curser. It also called as Iterator.
	//we do have another mehtod called getString(2);
	while(resset.next())
	{
		System.out.println(resset.getString(1) + "\t" + resset.getString(2) +"\t"+ resset.getString(3) +"\t"+ resset.getString(4) +"\t"+ resset.getString(5) +"\t"+ resset.getInt(6));
	}
//	Step5: close the connection
	con.close();
	}
}
