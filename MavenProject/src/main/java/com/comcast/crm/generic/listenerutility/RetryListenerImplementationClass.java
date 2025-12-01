package com.comcast.crm.generic.listenerutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerImplementationClass implements IRetryAnalyzer
{
	int count=0;
	int limitcount=4;
	public boolean retry(ITestResult result) {
		if(count<limitcount)
		{
			count++;
		return true;
		}
		else
		return false;
	} }


