package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test	
	public void Loginusr()
	{
		System.out.println("This is logging in user");
	}
	
	@Test(priority=1)
	public void Edituser()
	{
		System.out.println("This Editing user");
	}
	
	@Test(priority=2)
	public void Deleteuser()
	{
		System.out.println("This Deleting user");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}

}
