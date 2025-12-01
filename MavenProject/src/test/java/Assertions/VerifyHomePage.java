package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyHomePage {

@Test
public void VerifyHomePage()
{
	
SoftAssert asses=new SoftAssert();
	Reporter.log("Test1", true);
	Reporter.log("Test2", true);
	//SoftAssert
	asses.assertEquals("Home","Home");
	Reporter.log("Test3", true);
	Reporter.log("Test4", true);
	asses.assertAll();
	
}
	
@Test
public void VerifyLogo()
{
	SoftAssert asses=new SoftAssert();
	Reporter.log("Test1", true);
	Reporter.log("Test2", true);
	//SoftAssert
	asses.assertEquals("Home","Home");
	Reporter.log("Test3", true);
	Reporter.log("Test4", true);
	asses.assertAll();

}
}