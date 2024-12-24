package com.practice.obj_crm_ObjectReoputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productspage {
	WebDriver driver;

	public Productspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//img[@title='Create Product...']")
	private WebElement createProductBtn;
	
	@FindBy(xpath ="//input[@name='submit']")
	private WebElement searchnowBtn;

	public WebElement getCreateProductBtn() {
		return createProductBtn;
	}
	
	

}
