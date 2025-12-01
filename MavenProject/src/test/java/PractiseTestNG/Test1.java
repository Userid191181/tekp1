package PractiseTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(dataProvider="daa")
	public void sss(String LN, String FN)
	{
		System.out.println("third");
		System.out.println(FN);
		System.out.println(LN);	
	}
	
@DataProvider
public Object[][] daa()
{
	Object[][] aaa=new Object[3][2];
	aaa[0][0]="ddd";
	aaa[0][1]="sss";
	
	aaa[1][0]="ddd";
	aaa[1][1]="sss";
	
	aaa[2][0]="ddd";
	aaa[2][1]="sss";
	return aaa;
}

}
