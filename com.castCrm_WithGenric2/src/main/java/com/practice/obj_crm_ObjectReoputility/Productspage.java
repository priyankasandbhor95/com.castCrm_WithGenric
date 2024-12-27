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
	
//<<<<<<< HEAD
	@FindBy(xpath ="//input[@name='submit']")
	private WebElement searchnowBtn;
//=======
	@FindBy(name ="search_text")
	private WebElement search_textEdt;
//>>>>>>> branch 'master' of https://github.com/priyankasandbhor95/com.castCrm_WithGenric.git

	public WebElement getCreateProductBtn() {
		return createProductBtn;
	}
	
	

}
