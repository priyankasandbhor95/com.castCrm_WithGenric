package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationspage {
	
WebDriver driver;
	
	public Organizationspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//img[@title=\"Create Organization...\"]")
	private WebElement createOrgaBtn;
	
	@FindBy(name="search_text")
	private WebElement searchOrgEdt;
	
	@FindBy(name="search_field")
	private WebElement searchDD;
	
	@FindBy(xpath="//input[@name=\"submit\"]")
	private WebElement searchBtn;

	public WebElement getSearchOrgEdt() {
		return searchOrgEdt;
	}

	public WebElement getSearchDD() {
		return searchDD;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getCreateOrgaBtn() {
		return createOrgaBtn;
	}
	
	

}
