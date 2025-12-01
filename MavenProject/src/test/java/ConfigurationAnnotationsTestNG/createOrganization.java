package ConfigurationAnnotationsTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.generic.baseUtility.BaseClassTest;
public class createOrganization extends BaseClassTest {	
@Test
public void createOrg()
{	System.out.println("Create ORg Test and verify");}
@Test
public void createOrgWithIndustry()
{	System.out.println("Create ORg Testwith INdusrty and verify");}}