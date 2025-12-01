package ConfigurationAnnotationsTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.generic.baseUtility.BaseClassTest;

public class ActivateSim {

@Test(retryAnalyzer=com.comcast.crm.generic.listenerutility.RetryListenerImplementationClass.class)
public void ActivateSim()
{
	Reporter.log("Activation of new sim card", true);
	Reporter.log("step1");
	Assert.assertEquals("ffg", "ffffff");
}}
