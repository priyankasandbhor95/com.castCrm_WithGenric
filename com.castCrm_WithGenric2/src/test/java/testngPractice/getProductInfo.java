package testngPractice;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.practice.gen_crm_Filebutility.ExcelUtility;

public class getProductInfo {

	@Test(dataProvider = "getData")
	public void getProductInfoTest(String brandname,String productname)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandname,Keys.ENTER);
	String price=driver.findElement(By.xpath("//span[text()='"+productname+"']/../../../../div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[2]/span[2]")).getText();
	System.out.println("price "+price);
	driver.quit();
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		ExcelUtility elib=new ExcelUtility();
		int rowcount=elib.getRowCount("amazonProductInfo");
		Object[][] obj=new Object[rowcount][2];
		for(int i=0;i<rowcount;i++)
		{
			obj[i][0]=elib.getDataFromExcel("amazonProductInfo", i+1, 0);//arg1
			obj[i][1]=elib.getDataFromExcel("amazonProductInfo", i+1, 1);//arg2
		}
		
//		obj[0][0]="iphone";25
//		obj[0][1]="Apple iPhone 13 (128GB) - Pink";
//		
//		obj[1][0]="iphone";
//		obj[1][1]="Apple iPhone 15 (128 GB) - Blue";
//
//		obj[2][0]="iphone";
//		obj[2][1]="Apple iPhone 13 (128GB) - Midnight";

		

   return	obj;	
	}

}
