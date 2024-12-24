package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lookupBtnWindowpage {
	WebDriver driver;
	
	public lookupBtnWindowpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getLookup_searchtextEdt() {
		return lookup_searchtextEdt;
	}

	public WebElement getLookup_searchBtn() {
		return lookup_searchBtn;
	}

	@FindBy(xpath ="//input[@name=\"search_text\"]")
	private WebElement lookup_searchtextEdt;
	
	@FindBy(name ="search")
	private WebElement lookup_searchBtn;
	
	
	
	

}
