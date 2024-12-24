package testngPractice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.practice.list_crm_Listnerutility.ListnerImple;

import testngPractice_base_utility.BaseconfigClass;

public class extentreport_createContactTest2 extends BaseconfigClass {
	
	@Test
	public void createContactTest2_1()
	{
		/*
		 * create obj of extentsparkrepoter and specify location where you have to
		 * generate report config().settitle 
		 * config().setreport name 
		 * config().settheme
		 * 
		 */
		
		
//		test= report.createTest("createContactTest");
//		test.log(Status.INFO,"login to app");
//		test.log(Status.INFO,"navigate to contact page");
//		test.log(Status.INFO,"create contact");
        Assert.assertEquals("HDFC", "HFC");
				

	}
	
	@Test
	public void createContactTestwithphone2_2()
	{
		/*
		 * create obj of extentsparkrepoter and specify location where you have to
		 * generate report config().settitle 
		 * config().setreport name 
		 * config().settheme
		 * 
		 */
		
		
//		test= report.createTest("createContactTest");
//		test.log(Status.INFO,"login to app");
//		test.log(Status.INFO,"navigate to contact page");
//		test.log(Status.INFO,"create contact");
        Assert.assertEquals("Priyanka", "priya");
				

	}



	}

