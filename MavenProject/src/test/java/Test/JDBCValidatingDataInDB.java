package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.mysql.cj.jdbc.Driver;

@Test

public class JDBCValidatingDataInDB {
	
	public void ValidatingDataInDB() throws SQLException
	{
		String expprojectname="ProjectT28";
	Driver driverref=new Driver();
	DriverManager.registerDriver(driverref); 	
	Connection con=	DriverManager.getConnection("jdbc:mysql://49.249.28.218:3307/ninza_hrm", "root@%", "root"); 
	Statement state=con.createStatement();
	boolean flag=false;
	ResultSet resset=state.executeQuery("select * from project"); 
	while(resset.next())
	{
	String actprojectname=resset.getString(4);
	if(expprojectname.equals(actprojectname))
	{
		flag=true;
	System.out.println("expected project name " + expprojectname + " is equal to actual project name is available");	
	}
	}
	if(flag==false)
	{
		System.out.println("expected projectname is not available");
		Assert.fail(); //This is unittesting tool to Fail the test, else if the data is not available the script willl still pass the script displaying that the "expected projectname is not available"
		//So to fail it, we use Assert.fail().				
	}
	//We need to write else statement outside of the while loop. To use it we need to have flag which is boolean.
	//By default the value of boolean is false (adde it in line22.
	
	
	
	con.close();
	}
}
