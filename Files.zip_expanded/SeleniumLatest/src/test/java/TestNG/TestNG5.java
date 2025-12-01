package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG5 {

	@Test
	public void Sales1()
	{
		Reporter.log("sales are 191", true);
	}
	
	@Test(alwaysRun=true, enabled=false)
	public void Sales2()
	{
		Reporter.log("sales2 are 192", true);
	}
	
	@Test
	public void Sales3()
	{
		Reporter.log("sales3 are 193", true);
	}
	
	
	@Test
	public void Contacts()
	{
		Reporter.log("Depsnds on contacts", true);
	}
	
	@Test(dependsOnMethods="Contacts")
	public void CAlls()
	{
		Reporter.log("Depsnds on contacts for calls", true);
	}
	
}
