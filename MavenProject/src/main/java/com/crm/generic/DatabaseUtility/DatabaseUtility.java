package com.crm.generic.DatabaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection con;
	public void getDatabaseConnection(String url, String username, String password) throws SQLException
	{
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(url, username, password);
		}
		catch (Exception e)
		{
			
		}		
	}
	
	//hardcoding the url,username and password as DB, username and password may not change in the project
	public void getDatabase() throws SQLException
	{
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection("jbdc:mysql:10.10.10.20:3306/projects", "root@1", "root");
		}
		catch (Exception e)
		{
			
		}		
	}
	
	public void closedbConnection() throws SQLException
	{
		con.close();
	}
	
	public ResultSet executeSelectQuery(String query) throws SQLException
	{
		ResultSet res=null;
		try {
		Statement s=con.createStatement();
		res= s.executeQuery(query);		
		}
		catch (Exception e)		
		{			
		}
		return res;
	}
	
	public int executeNonSelectQuery(String query)
	{
		int result=0;
		try
		{
			Statement s=con.createStatement();
			result=s.executeUpdate(query);
		}
		catch (Exception e)
		{
			
		}
		return result;
	}
	
	
	public void closedbconnection()
	{
		try {
			con.close();
			
		}
		catch(Exception e)
		{
			
		}
		
	}

}
