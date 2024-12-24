package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactpage {
	WebDriver driver;
	
	public CreatingNewContactpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name ="lastname")
	private WebElement lastnameContEdt;
	
	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement SaveContBtn;
	
	@FindBy(name="support_start_date")
	private WebElement startDateEdt;
	
	@FindBy(name="support_end_date")
	private WebElement endDateEdt;
	
	@FindBy(xpath="(//img[@title=\"Select\"])[1]")
	private WebElement lookupBtn;

	
	

	public WebElement getStartDateEdt() {
		return startDateEdt;
	}

	public WebElement getEndDateEdt() {
		return endDateEdt;
	}

	public WebElement getLookupBtn() {
		return lookupBtn;
	}

	public WebElement getLastnameContEdt() {
		return lastnameContEdt;
	}

	public WebElement getSaveContBtn() {
		return SaveContBtn;
	}
	
	public void createContactWithMandatoryField(String lastname)//tc_01
	{
		lastnameContEdt.sendKeys(lastname);
		SaveContBtn.click();
	}
	
	public void createContactWithSupportDate(String lastname,String sdate,String edate)//tc_02
	{
		
		lastnameContEdt.sendKeys(lastname);
		startDateEdt.clear();
		startDateEdt.sendKeys(sdate);
		endDateEdt.clear();
		endDateEdt.sendKeys(edate);
		SaveContBtn.click();
	}
	
	
	

}
