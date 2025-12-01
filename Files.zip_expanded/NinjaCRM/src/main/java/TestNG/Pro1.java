package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pro1 {
	@Test
	public void amazon()
	{
		Reporter.log("this is first amazon as testng",true);
	}
	@Test
	public void amazon1()
	{
		Reporter.log("this is first amazon1 as testng",true);
	}
	@Test
	public void blinkit()
	{
		Reporter.log("this is first blinkit as testng",true);
	}
	@Test
	public void flipkart()
	{
		Reporter.log("this is first flipkart as testng",true);
	}
	@Test
	public void meesho()
	{
		Reporter.log("this is first meesho as testng",true);
	}
}
