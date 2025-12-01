package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCTryCatchFinally {
public static void main(String[] args) throws SQLException {
	Connection conn=null; //making connection object as global variable
	
	try {
//	Step1: load/register db driver
	Driver driverref=new Driver();
	DriverManager.registerDriver(driverref); 
//	Step2: connect to db
	conn=DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm", "root@%", "root"); 
//	Step3: create sql statement 
	Statement state=conn.createStatement();
//  Step4 : execute select query
	ResultSet resset=state.executeQuery("select * from project2222"); //wrong table name is entered
	while(resset.next())
	{
		System.out.println(resset.getString(1) + "\t" + resset.getString(2) +"\t"+ resset.getString(3) +"\t"+ resset.getString(4) +"\t"+ resset.getString(5) +"\t"+ resset.getInt(6));
	}	}
	catch(Exception a)	{
	System.out.println("Handle any type of exception");	}
	finally{
		conn.close();
		System.out.println("close connection");
	}}}