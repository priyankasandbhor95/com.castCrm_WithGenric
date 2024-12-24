package com.practice.gen_crm_WebDriverutility;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testngPractice_base_utility.BaseconfigClass;



public class WebDriverUtility {

		public void waitForPageToLoad(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		public void waitForElementPresent(WebDriver driver,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	
		public void switchToTabOnUrl(WebDriver driver,String partialUrl) {
			Set<String> set=driver.getWindowHandles();
			Iterator<String> itr=set.iterator();
			while (itr.hasNext()) {
				String windowid = (String) itr.next();
				driver.switchTo().window(windowid);
				
				String acturl=driver.getCurrentUrl();
				if(acturl.contains(partialUrl))
				{
					break;
				}
		}
			
		}
		
		public void switchToTabOnTitle(WebDriver driver,String partialTitle) {
			Set<String> set=driver.getWindowHandles();
			Iterator<String> itr=set.iterator();
			while (itr.hasNext()) {
				String windowid = (String) itr.next();
				driver.switchTo().window(windowid);
				
				String acturl=driver.getTitle();
				if(acturl.contains(partialTitle))
				{
					break;
				}
		}
			
		}
			
			
		public void switchToFrame(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
		
		public void switchToFrame(WebDriver driver,String nameId)
		{
			driver.switchTo().frame(nameId);
		}
		
		public void switchToFrame(WebDriver driver,WebElement element)
		{
			driver.switchTo().frame(element);
		}
		
		
		public void switchToalertAndAccept(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		
		public void switchToalertAndCancel(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}

		public void select(WebElement element,int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		
		public void select(WebElement element,String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}

		public void moveOnElement(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.moveToElement(element).perform();
		}
		
		public void doubleclick(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.doubleClick(element).perform();

		}
		
		public void takeWebPageScreenShot(WebDriver driver,String methodname) throws IOException {
			//JavaUtility jlib=new JavaUtility();
			//int random_number=jlib.getrandomnumber();
		Date d1=new Date();
		String time=d1.toString().replace(" ","_").replace(":", "_");
			System.out.println(time);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			//File dest=new File("./Screenshot/"+methodname+"_"+random_number+".png");
			File dest=new File("./Screenshot/"+methodname+"_"+time+".png");

			FileHandler.copy(temp, dest);
			
		}
		
		public String takeScreenshotAndattachToReportatScriptFailure()
		{
			Date d1=new Date();
			String time=d1.toString().replace(" ","_").replace(":", "_");
			System.out.println(time);
			TakesScreenshot ts=(TakesScreenshot)BaseconfigClass.sdriver;
			String filepath=ts.getScreenshotAs(OutputType.BASE64);
			return filepath;
		}
		
		public void takeWebElementScreenshot(WebElement element) throws IOException {
			
			File temp = element.getScreenshotAs(OutputType.FILE);
		//	File dest=new File(FrameWorkConstants.screenshotPath+javaUtility.localDateTime()+".png");
			File dest=new File("./Screenshot/s2.png");

			FileHandler.copy(temp, dest);
			
		}
		
}
