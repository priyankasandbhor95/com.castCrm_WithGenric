package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactspage {

	
WebDriver driver;
	
	public Contactspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//img[@title=\"Create Contact...\"]")
	private WebElement createContBtn;

	public WebElement getCreateContBtn() {
		return createContBtn;
	}

	public void setCreateContBtn(WebElement createContBtn) {
		this.createContBtn = createContBtn;
	}
	
	
	
}
