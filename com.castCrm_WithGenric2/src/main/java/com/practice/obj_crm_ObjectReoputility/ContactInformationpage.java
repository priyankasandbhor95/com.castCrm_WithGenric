package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationpage {
	WebDriver driver;
	public ContactInformationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="dtlview_Last Name")
	private WebElement lastNameInfo;
	
	@FindBy(id="dtlview_Support Start Date")
	private WebElement startDateInfoEdt;
	
	@FindBy(id="dtlview_Support End Date")
	private WebElement endDateInfoEdt;

	
// void verifyContactInfo(String lastnameip)//tc_01 org
//	{
//		String lastnameInfo=lastNameInfo.getText();
//		
//		
//		if(lastnameInfo.contains(lastnameip))
//		{
//			System.out.println("lastname is created:=pass");
//		}
//		else
//		{
//			System.out.println("lastname is not created:=fail");
//
//		}
//		
//	}
	
	public WebElement getLastNameInfo() {
		return lastNameInfo;
	}

	public WebElement getStartDateInfoEdt() {
		return startDateInfoEdt;
	}

	public WebElement getEndDateInfoEdt() {
		return endDateInfoEdt;
	}

//	public void verifyExpectedStartDate(String startdate)
//	{
//		String startdateinfo=startDateInfoEdt.getText();
//		if(startdateinfo.equals(startdate))
//		{
//			System.out.println("startDate is Verified:=pass");
//		}
//		else
//		{
//			System.out.println("startDate  is not Verified:=fail");
//
//		}
//	}
	
//	public void verifyExpectedEndDate(String enddate)
//	{
//		String enddateinfo=endDateInfoEdt.getText();
//		if(enddateinfo.equals(enddate))
//		{
//			System.out.println("endDate is Verified:=pass");
//		}
//		else
//		{
//			System.out.println("endDate  is not Verified:=fail");
//
//		}
//	}
	
	
}
