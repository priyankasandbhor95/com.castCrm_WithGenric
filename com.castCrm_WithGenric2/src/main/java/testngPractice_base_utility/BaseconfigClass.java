package testngPractice_base_utility;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.practice.gen_crm_Filebutility.ExcelUtility;
import com.practice.gen_crm_Filebutility.Fileutility;
import com.practice.gen_crm_WebDriverutility.JavaUtility;
import com.practice.gen_crm_WebDriverutility.WebDriverUtility;
import com.practice.gen_crm_WebDriverutility.utilityclassobject;
import com.practice.obj_crm_ObjectReoputility.Homepage;
import com.practice.obj_crm_ObjectReoputility.Loginpage;

public class BaseconfigClass {
	/*create object*/
public	Fileutility flib=new Fileutility();
public	JavaUtility jlib=new JavaUtility();
public	ExcelUtility elib=new ExcelUtility();
public	WebDriverUtility wlib=new WebDriverUtility();
public WebDriver driver=null;
public static WebDriver sdriver=null;
//public static ExtentTest test;
//public static ExtentReports report;


	
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void bm() throws IOException
	{
		System.out.println("Login to APP");
		 wlib.waitForPageToLoad(driver);//Implicit wait
		 String URL =flib.getDataFromPropertiesFile("url");
			String USERNAME=flib.getDataFromPropertiesFile("username");
			String PASSWORD=flib.getDataFromPropertiesFile("password");   
			driver.get(URL);
			Loginpage lp=new Loginpage(driver);
			lp.loginToApp(USERNAME, PASSWORD);//Login To App
	}
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void am()
	{
		System.out.println("Logout From app");
		Homepage hp=new Homepage(driver);
		wlib.moveOnElement(driver, hp.getAdminImgBtn());//click on admin btn on homepage

		hp.getSignOutLinkBtn().click();//click on signoutbtn
	}
	
	//@Parameters("BROWSER")//cross browser
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	//public void bc(String browser) throws IOException
	public void bc() throws IOException
	{
		System.out.println("Launch Browser");
		
		//String BROWSER=browser;//cross browser
		String BROWSER=flib.getDataFromPropertiesFile("browser");
		
		if (BROWSER.equals("chrome")) {
			 driver=new ChromeDriver();

		}
		else if (BROWSER.equals("firefox")) {
			 driver=new FirefoxDriver() ;

		}
		else if (BROWSER.equals("edge")) {
			 driver=new EdgeDriver ();

		}
		sdriver=driver;
		utilityclassobject.setDriver(driver);
	}

	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void ac()
	{
		System.out.println("Close Browser");
		driver.quit();
		
	}

	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void bs()
	{
		System.out.println("connect db and report config");
		
		
		
	}

	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void as()
	{
		System.out.println("close db and report backup ");
		
		

	}

}
