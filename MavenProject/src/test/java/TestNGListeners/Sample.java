package TestNGListeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.generic.baseUtility.BaseClassTest;
//@Listeners(com.comcast.crm.listenerutility.ListenerImplementationClass.class)
public class Sample extends BaseClassTest{	
@Test
public void CreateInvoiceTest()
{
	Reporter.log("CreateInvoice", true);
	String actTitle=driver.getTitle();
	Assert.assertEquals(actTitle, "Logindddd"); //Purposely failing the test
	Reporter.log("Step1", true);
	Reporter.log("Step2", true);
	Reporter.log("Step3", true);
}

@Test
public void CreateInvoiceWithContactTest()
{
	Reporter.log("CreateInvoiceWithContact", true);
	String actTitle=driver.getTitle();
	Assert.assertEquals(actTitle, "Loginddd"); //Purposely failing the test
	Reporter.log("Step4", true);
	Reporter.log("Step5", true);
	Reporter.log("Step6", true);
}	
}
