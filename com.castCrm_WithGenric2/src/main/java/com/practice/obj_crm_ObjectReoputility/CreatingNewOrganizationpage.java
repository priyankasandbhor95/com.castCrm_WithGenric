package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationpage {

	WebDriver driver;
	public CreatingNewOrganizationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name = "accountname")
	private WebElement OrgNameEdt;
	
	@FindBy(xpath ="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement SaveTopBtn;
	
	@FindBy(name = "industry")
	private WebElement IndustryDDEdt;
	
	@FindBy(name = "accounttype")
	private WebElement accounttypeDDEdt;
	
	@FindBy(id="phone")
	private WebElement phonenumberEdt;

	
	public WebElement getOrgNameEdt() {
		return OrgNameEdt;
	}

	public WebElement getSaveTopBtn() {
		return SaveTopBtn;
	}

	public WebElement getIndustryDDEdt() {
		return IndustryDDEdt;
	}

	public WebElement getAccounttypeDDEdt() {
		return accounttypeDDEdt;
	}

	public void createOrgWithMandatoryField(String orgname)
	{
		OrgNameEdt.sendKeys(orgname);
		SaveTopBtn.click();
	}
	
	public void createOrgWith_Org_Intdustry_TypeField(String orgname,String Industry,String Type)
	{
		OrgNameEdt.sendKeys(orgname);
		IndustryDDEdt.sendKeys(Industry);
		accounttypeDDEdt.sendKeys(Type);
		SaveTopBtn.click();
	}
	
	public void createOrgWith_Org_Phone(String orgname,String phoneNumber)
	{
		OrgNameEdt.sendKeys(orgname);
		phonenumberEdt.sendKeys(phoneNumber);
		SaveTopBtn.click();
	}

}
