package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TestNG3 {

	@Test(priority=2)	
	public void CreateMethod()
	{
		Reporter.log("Create MEthod", true);
	}
	
	@Test(enabled=false)	//this will skip this test case execution as enabled is marked as false
	public void Create1Method()
	{
		Reporter.log("Create MEthod", true);
	}
	
	@Test(priority=0)	//this testcase with 0 will be the top priority to be executed first
	public void EditMethod()
	{
		Reporter.log("EditMEthod", true);
	}
	
	@Test(invocationCount=3, priority=1)	//this testcase will be executed 3 times and with priority as 1
	public void ModifyMethod()
	{
		Reporter.log("ModifyMEthod", true);
	}

}
