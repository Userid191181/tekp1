package Test;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXML {
@Test
	public void readfromxml(XmlTest abc)
	{
		System.out.println(abc.getParameter("browser"));
		System.out.println(abc.getParameter("url"));
		System.out.println(abc.getParameter("username"));
		System.out.println(abc.getParameter("password"));
	}

}
