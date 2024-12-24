package com.practice.obj_crm_ObjectReoputility;

import java.net.http.WebSocket;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name = "user_name")
	private WebElement userEdt;
	
	@FindBy(name = "user_password")
	private WebElement passEdt;
	
	@FindBy(id  = "submitButton")
	private WebElement LoginBtn;

	public WebElement getUserEdt() {
		return userEdt;
	}

	public WebElement getPassEdt() {
		return passEdt;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void loginToApp(String username,String password)
	{
		userEdt.sendKeys(username);
		passEdt.sendKeys(password);
		LoginBtn.click();
	}
	
	
	
}
