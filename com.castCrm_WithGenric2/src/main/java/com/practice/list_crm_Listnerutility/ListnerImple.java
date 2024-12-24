package com.practice.list_crm_Listnerutility;

import java.io.IOException;
import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.practice.gen_crm_WebDriverutility.WebDriverUtility;
import com.practice.gen_crm_WebDriverutility.utilityclassobject;

import testngPractice_base_utility.BaseconfigClass;

public class ListnerImple implements ITestListener,ISuiteListener{
	public ExtentReports report;
 public static ExtentTest test;
 String time;

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		result.getMethod().getMethodName();
		WebDriverUtility wlib=new WebDriverUtility();
		try {
			wlib.takeWebPageScreenShot(BaseconfigClass.sdriver,result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String filepath=wlib.takeScreenshotAndattachToReportatScriptFailure();
		test.log(Status.FAIL,result.getMethod().getMethodName()+"========>FAIL==========");
		test.addScreenCaptureFromBase64String(filepath,result.getMethod().getMethodName()+"_"+time);
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("=========Start=========="+result.getMethod().getMethodName());
		test=report.createTest(result.getMethod().getMethodName());
		utilityclassobject.setTest(test);
		test.log(Status.INFO, result.getMethod().getMethodName()+"=======>STARTED======");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("=========Sucess=========="+result.getMethod().getMethodName());
		test.log(Status.PASS,result.getMethod().getMethodName()+"===========>COMPLETED=======");

	}
	
	

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		ISuiteListener.super.onStart(suite);

		System.out.println("=========Configure report==========");
		
		//SPARK REPORT CONFIG
		Date d1=new Date();
		time=d1.toString().replace(" ","_").replace(":", "_");
		System.out.println(time);
		
				ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report_"+time+".html");
				spark.config().setDocumentTitle("CRM result Report");
				spark.config().setReportName("CRM report");
				spark.config().setTheme(Theme.DARK);
				
				//ADD ENV INFO AND CREATE TEST
				report=new ExtentReports();
			    report.attachReporter(spark);
				report.setSystemInfo("os", "windows-10");
				report.setSystemInfo("browser", "chrome-100");
		
	}
	
	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		ISuiteListener.super.onFinish(suite);
		
		System.out.println("=========Configure report Backup==========");
		//report backup
		report.flush();


	}

}
