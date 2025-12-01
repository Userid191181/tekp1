package PractiseTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {

@Test(dataProvider="abc")
public void ddd(String FN, String LN)
{
	System.out.println(FN + "lastname" +LN);
}
	
@DataProvider
public Object abc()
{
Object[][] arr=new Object[3][2];
arr[0][0]="aa";
arr[0][1]="bb";

arr[1][0]="cc";
arr[1][1]="dd";

arr[2][0]="ee";
arr[2][1]="ff";

return arr;

}
}