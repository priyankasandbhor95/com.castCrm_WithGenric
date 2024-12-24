package com.practice.list_crm_Listnerutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzerImp implements IRetryAnalyzer {
	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int upperlimit=5;
		// TODO Auto-generated method stub
		if(count<upperlimit)
		{
			count++;
			System.out.println(count);
			return true;
		}
		return false;
	}

}
