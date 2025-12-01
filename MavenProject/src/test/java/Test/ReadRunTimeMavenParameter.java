package Test;

import org.testng.annotations.Test;

public class ReadRunTimeMavenParameter {
	
	@Test
	public void runtimeParameterTest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String ID = System.getProperty("username");
		String PWD = System.getProperty("password");
		
		System.out.println("url is : " +URL);
		System.out.println("browser is :" +BROWSER);
		System.out.println("id is : " +ID);
		System.out.println("pwd is : " +PWD);
	}
}
