package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pro2 {
	@Test(priority =-3)
	public void createcamp()
	{
		Reporter.log("creating", true);
	}
	@Test(priority =-1)
	public void updatecamp()
	{
		Reporter.log("updating", true);
	}
	@Test
	public void deletecamp()
	{
		Reporter.log("deleting", true);
	}
	@Test(invocationCount=1)
	public void invocationcount()
	{
		Reporter.log("invocation count program", true);
	}
}
