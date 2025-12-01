package com.crm.generic.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertiesFile(String key) throws IOException
	{
		
		FileInputStream fis=new FileInputStream("./ConfigAppData/commonData.properties");
		//FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");		
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);		
		return data;
	}

}
