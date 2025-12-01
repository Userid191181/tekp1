package PractiseTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactUsingDataProvider {
	@Test(dataProvider="getData")  //specify dataprovider for the test case.
	public void createContact(String FirstName, String LastName, long PhoneNumber)
	{
		System.out.println("FIRSTNAME is : " + FirstName + ", LASTNAME is : " + LastName + " PHONENUMBER is " + PhoneNumber);		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr = new Object[3][3]; //3 indicates number of times (rows) data should be executed and 2 indicates number of arguments 
		objArr[0][0]="Ravi";
		objArr[0][1]="Basu";
		objArr[0][2]=9379845335l;
		
		objArr[1][0]="Sam";
		objArr[1][1]="Dam";
		objArr[1][2]=9379845336l;
		
		objArr[2][0]="Hari";
		objArr[2][1]="Rao";		
		objArr[2][2]=9379845337l;
		return objArr;		
	}
}
