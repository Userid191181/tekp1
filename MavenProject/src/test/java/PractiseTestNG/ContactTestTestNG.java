package PractiseTestNG;

import org.testng.annotations.Test;

public class ContactTestTestNG {	
	@Test(invocationCount=3)
	public void createContactTest()
	{
		System.out.println("execute CreateContact");
	}	
	@Test(enabled=false)
	public void modifyContactTest() 
	{
		System.out.println("execute modifyContact");
	}
	
}