package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test(dependsOnGroups="sample")
	public void Single()
	{
		Reporter.log("Single", true);
	}
	
	
	@Test(groups="sample")
	public void T1()
	{
		Reporter.log("Test1", true);
	}
	
	@Test(groups="sample")
	public void T2()
	{
		Reporter.log("Test2", true);
	}
	
	@Test(groups="sample")
	public void T3()
	{
		Reporter.log("Test3", true);
	}
	
	@Test(groups="sample")
	public void T4()
	{
		Reporter.log("Test4", true);
	}
	
	@Test(groups="sample")
	public void T5()
	{
		Reporter.log("Test5", true);
	}
	
	
	
}
