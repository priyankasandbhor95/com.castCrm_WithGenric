package Modulegeneric_Contact_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.practice.gen_crm_Filebutility.ExcelUtility;
import com.practice.gen_crm_Filebutility.Fileutility;
import com.practice.gen_crm_WebDriverutility.JavaUtility;
import com.practice.gen_crm_WebDriverutility.WebDriverUtility;
import com.practice.gen_crm_WebDriverutility.utilityclassobject;
import com.practice.list_crm_Listnerutility.ListnerImple;
import com.practice.obj_crm_ObjectReoputility.ContactInformationpage;
import com.practice.obj_crm_ObjectReoputility.Contactspage;
import com.practice.obj_crm_ObjectReoputility.CreatingNewContactpage;
import com.practice.obj_crm_ObjectReoputility.CreatingNewOrganizationpage;
import com.practice.obj_crm_ObjectReoputility.Homepage;
import com.practice.obj_crm_ObjectReoputility.Loginpage;
import com.practice.obj_crm_ObjectReoputility.OrganizationInformationpage;
import com.practice.obj_crm_ObjectReoputility.Organizationspage;
import com.practice.obj_crm_ObjectReoputility.lookupBtnWindowpage;

import testngPractice_base_utility.BaseconfigClass;

public class createContact_tc_01Test extends BaseconfigClass {

	@Test(groups = "smokeTest")
	public void createContact_tc_01Test()throws IOException {
		
		
		//*****************generate randum number
				int random_num=jlib.getrandomnumber();

		
		//***************getDataFrom ExcelFile
		String lastName=elib.getDataFromExcel("contact", 1, 2);
		utilityclassobject.getTest().log(Status.INFO, "read data from excel");

		
		Homepage hp=new Homepage(driver);
		hp.clickonContactlink();//Click on Contact link on homepage
		utilityclassobject.getTest().log(Status.INFO, "navigate to contact page");

		
		Contactspage cp=new Contactspage (driver);
		cp.getCreateContBtn().click(); //click on create new contact btn in organization page
		utilityclassobject.getTest().log(Status.INFO, "creating new contact");

		
		CreatingNewContactpage ccp=new CreatingNewContactpage(driver);//create new contact with mandatory field and save it
		ccp.createContactWithMandatoryField(lastName);
		utilityclassobject.getTest().log(Status.INFO, "contact created with mandatory field");

		
		//*************verify expected result LastName
		ContactInformationpage Cip=new ContactInformationpage(driver);
//		Cip.verifyContactInfo(lastName);
		
        String lastnameInfo=Cip.getLastNameInfo().getText();
		Assert.assertEquals(lastnameInfo, lastName);
		
//		if(lastnameInfo.contains(lastName))
//		{
//			System.out.println("lastname is created:=pass");
//		}
//		else
//		{
//			System.out.println("lastname is not created:=fail");
//
//		}
		
		
		
		
	}
	
	@Test(groups = "regressionTest")
	public void createContact_tc_02withSupportDateTest()throws IOException {
		
		
				//*****************generate randum number
				int random_num=jlib.getrandomnumber();

		
		
		//***************getDataFrom ExcelFile
				String lastName=elib.getDataFromExcel("contact", 1, 2);
				utilityclassobject.getTest().log(Status.INFO, "read data from excel");

		

		
		Homepage hp=new Homepage(driver);
		hp.clickonContactlink();//Click on Contact link on homepage
		utilityclassobject.getTest().log(Status.INFO, "navigate to contact page");

		
		Contactspage cp=new Contactspage (driver);
		cp.getCreateContBtn().click(); //click on create new contact btn in organization page		
		utilityclassobject.getTest().log(Status.INFO, "creating new contact");

		
		
		
		//***************capture system date
		String startdate= jlib.getSystemDateInYYYYMMDD();
		String enddate=jlib.getRequireDateYYYYMMDD(30);
       System.out.println(startdate);
       System.out.println(enddate);
        
       CreatingNewContactpage ccp=new CreatingNewContactpage(driver);
       ccp.createContactWithSupportDate(lastName, startdate, enddate);
       utilityclassobject.getTest().log(Status.INFO, "contact created with support date");

		
		
		ContactInformationpage cip=new ContactInformationpage(driver);
		//cip.verifyExpectedStartDate(startdate);
		//cip.verifyExpectedEndDate(enddate);
		
		String startdateinfo=cip.getStartDateInfoEdt().getText();
		Assert.assertEquals(startdateinfo, startdate);
		
//		if(startdateinfo.equals(startdate))
//		{
//			System.out.println("startDate is Verified:=pass");
//		}
//		else
//		{
//			System.out.println("startDate  is not Verified:=fail");
//
//		}
		
		String enddateinfo=cip.getEndDateInfoEdt().getText();
		Assert.assertEquals(enddateinfo, enddate);
//		if(enddateinfo.equals(enddate))
//		{
//			System.out.println("endDate is Verified:=pass");
//		}
//		else
//		{
//			System.out.println("endDate  is not Verified:=fail");
//
//		}
		
	}

	@Test(groups = "regressionTest")
	public void createContact_tc_03_withOrgTest() throws IOException
	{
		
			
					//*****************generate randum number
					int random_num=jlib.getrandomnumber();

			
		
			//***************getDataFrom ExcelFile
					String orgname=elib.getDataFromExcel("contact", 7, 2)+random_num;
					String contactlastname=elib.getDataFromExcel("contact", 7, 3);
					utilityclassobject.getTest().log(Status.INFO, "read data from excel");

			
				
					
			Homepage hp=new Homepage(driver);
			hp.clickonOrganizationlink();//Click on Oraganization link on homepage
			utilityclassobject.getTest().log(Status.INFO, "navigate to oragnization page");

	        
			Organizationspage op=new Organizationspage(driver);
			op.getCreateOrgaBtn().click(); //click on create new organization btn in organization page
			utilityclassobject.getTest().log(Status.INFO, "creating new org");

			CreatingNewOrganizationpage createNewOrg=new CreatingNewOrganizationpage(driver);
			createNewOrg.createOrgWithMandatoryField(orgname); //enter all organization mandatory details and save it
			utilityclassobject.getTest().log(Status.INFO, "org created with mandatory field");

			//*************verify expected result Header msg
			
			OrganizationInformationpage orgInfoPage=new OrganizationInformationpage(driver);
			orgInfoPage.verifyHeaderInfo(orgname);//verify header
			utilityclassobject.getTest().log(Status.INFO, "organization info page");

			//*****create contact Integration of two module
			
			hp.clickonContactlink();//Click on Contact link on homepage
			utilityclassobject.getTest().log(Status.INFO, "navigating to contact page");

			
			Contactspage cp=new Contactspage (driver);
			cp.getCreateContBtn().click(); //click on create new contact btn in organization page
			utilityclassobject.getTest().log(Status.INFO, "creating new contact");

			 CreatingNewContactpage ccp=new CreatingNewContactpage(driver);
			 ccp.getLastnameContEdt().sendKeys(contactlastname);
			 ccp.getLookupBtn().click();
			 
			 utilityclassobject.getTest().log(Status.INFO, "creating new contact with lastname and integrating with org");

			
			//xpath //input[@name='account_name']/following-sibling::img
			
			//******************switch to child window
			wlib.switchToTabOnUrl(driver, "module=Accounts");
			
			//lookupWindow info
			lookupBtnWindowpage lbtnwinpage=new lookupBtnWindowpage(driver);
			lbtnwinpage.getLookup_searchtextEdt().sendKeys(orgname);
			lbtnwinpage.getLookup_searchBtn().click();
			driver.findElement(By.xpath("//a[text()='"+orgname+"']")).click();//********dynamic xpth
			
			//******************switch to parent window back
			
			wlib.switchToTabOnUrl(driver, "module=Contacts&action");
			ccp.getSaveContBtn().click();		
			//verify header info
			utilityclassobject.getTest().log(Status.INFO, "contact created with integration of org");

			String headerInfo1=driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();
			boolean status=headerInfo1.contains(contactlastname);
			Assert.assertEquals(status, true);
//			if(headerInfo1.contains(contactlastname))
//			{
//				System.out.println(contactlastname+" oragname is created:=pass");
//			}
//			else
//			{
//				System.out.println(contactlastname+" oragname is not created:=fail");
//
//			}
			
			//************* verify expected result Oraganization name
			
			String actorgname=driver.findElement(By.id("mouseArea_Organization Name")).getText();
			System.out.println(actorgname);
			Assert.assertEquals(actorgname.trim(), orgname);
//			if(actorgname.trim().equals(orgname))
//			{
//				System.out.println(orgname+" oragname is created:=pass");
//
//			}
//			else
//			{
//				System.out.println(orgname+" oragname is not created:=fail");
//
//			}
//			
		
		}


}
