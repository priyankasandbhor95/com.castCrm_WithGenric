package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orglink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactlink;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement adminImgBtn;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLinkBtn;

	

	public WebElement getAdminImgBtn() {
		return adminImgBtn;
	}

	public WebElement getSignOutLinkBtn() {
		return signOutLinkBtn;
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}
	
	public void clickonOrganizationlink()
	{
		orglink.click();
	}
	
	public void clickonContactlink()
	{
		contactlink.click();
	}
	
	
	
	
	


}
