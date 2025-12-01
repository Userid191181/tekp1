package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TestNG1 {

	@Test
	public void test()
	{
		Reporter.log("helo", true);
	}
	
}
