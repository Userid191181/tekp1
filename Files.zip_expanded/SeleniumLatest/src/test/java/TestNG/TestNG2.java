package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TestNG2 {

	@Test	
	public void CreateMethod()
	{
		Reporter.log("Create MEthod", true);
	}
	
	public void EditMethod()
	{
		Reporter.log("EditMEthod", true);
	}
	

}
