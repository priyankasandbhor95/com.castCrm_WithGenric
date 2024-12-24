package practice_assert_homeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.obj_crm_ObjectReoputility.Loginpage;

public class HomepageverificationTest {
	@Test
	public void verifyHomeTextAfterLogin()
	{
		System.out.println("**********verifyHomeTextAfterLogin test start*******");
		String expectedPage="Home Page";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost:8888");
		
		Loginpage lp=new Loginpage(driver);
		lp.loginToApp("admin","admin");
		
		
		String actTitle=driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
		/*if(actTitle.trim().equals(expectedPage))
		{
			System.out.println(expectedPage+"  is  varified==PASS");
		}
		else
		{
			System.out.println(expectedPage+"  is not  varified ==FAIL");

		}*/
		
		Assert.assertEquals(actTitle, expectedPage);
		driver.quit();
		System.out.println("**********verifyHomeTextAfterLogin test end*******");

	}
	
	@Test
	public void verifyLogoOnHomepageAfterLogin()
	{
		System.out.println("**********verifyLogoOnHomepageAfterLogin test start*******");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost:8888");
		
		Loginpage lp=new Loginpage(driver);
		lp.loginToApp("admin","admin");
		
		boolean status= driver.findElement(By.xpath("//img[@title=\"vtiger-crm-logo.gif\"]")).isEnabled();
		Assert.assertTrue(status);
		/*if(status==true)
		{
			System.out.println("Logo  is  varified==PASS");
		}
		else
		{
			System.out.println("Logo is not  varified ==FAIL");

		}*/
		driver.quit();

		System.out.println("verifyLogoOnHomepageAfterLogin text end");
		
	}

}
