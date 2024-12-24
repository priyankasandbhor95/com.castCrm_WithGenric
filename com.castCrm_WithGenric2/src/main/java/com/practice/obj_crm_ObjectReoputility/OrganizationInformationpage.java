package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationpage {
	WebDriver driver;
	public OrganizationInformationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[@class=\"dvHeaderText\"]")
	private WebElement orgHeaderInfo;
	
	@FindBy(xpath = "//span[@id=\"dtlview_Organization Name\"]")
	private WebElement actualOrgName;
	
	@FindBy(id="dtlview_Industry")
	private WebElement industryInfo;
	
	@FindBy(id="dtlview_Type")
	private WebElement accTypeInfo;
	
	@FindBy(id="dtlview_Phone")
	private WebElement phoneInfo;
	
	
	
	public WebElement getOrgHeaderInfo() {
		return orgHeaderInfo;
	}

	public WebElement getActualOrgName() {
		return actualOrgName;
	}
	
	public void verifyPhone(String phoneNumber)//tc 03 org
	{
		String actPhoneNum= phoneInfo.getText();
		if(actPhoneNum.equals(phoneNumber))
		{
			System.out.println("Phone num is verifird :=pass");

		}
		else
		{
			System.out.println("Phone num is not verifird :=fail");

		}
	}
	
	
	public void verifyIndustryInfo(String industry)//tc_02 org
	{
		String actIndustries=industryInfo.getText();

			if(actIndustries.equals(industry))
			{
				System.out.println("industry name is varified");
		
			}
			else
			{
				System.out.println("industry name is not varified");
		
			}
	}
	
	public void verifyTypeInfo(String type)//tc_02 org
	{
		String actType=accTypeInfo.getText();

			if(actType.equals(type))
			{
				System.out.println("type is varified");
		
			}
			else
			{
				System.out.println("type  is not varified");
		
			}
	}
	
	
	public void verifyHeaderInfo(String orgname)//tc_01 org
	{
		String header=orgHeaderInfo.getText();
		if(header.contains(orgname))
		{
			System.out.println("oragname is created:=pass");
		}
		else
		{
			System.out.println("oragname is not created:=fail");

		}
		
	}
	
	public void verifyOrgName(String orgname)//tc_01 org
	{
		String actalOrgName=actualOrgName.getText();
		if(actalOrgName.equals(orgname))
		{
			System.out.println("oragname is created:=pass");

		}
		else
		{
			System.out.println("oragname is not created:=fail");

		}

	}
}
