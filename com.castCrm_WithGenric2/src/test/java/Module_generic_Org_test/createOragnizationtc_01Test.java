package Module_generic_Org_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.practice.gen_crm_Filebutility.ExcelUtility;
import com.practice.gen_crm_Filebutility.Fileutility;
import com.practice.gen_crm_WebDriverutility.JavaUtility;
import com.practice.gen_crm_WebDriverutility.WebDriverUtility;
import com.practice.gen_crm_WebDriverutility.utilityclassobject;
import com.practice.list_crm_Listnerutility.ListnerImple;
import com.practice.obj_crm_ObjectReoputility.CreatingNewOrganizationpage;
import com.practice.obj_crm_ObjectReoputility.Homepage;
import com.practice.obj_crm_ObjectReoputility.Loginpage;
import com.practice.obj_crm_ObjectReoputility.OrganizationInformationpage;
import com.practice.obj_crm_ObjectReoputility.Organizationspage;

import testngPractice_base_utility.BaseconfigClass;

public class createOragnizationtc_01Test extends BaseconfigClass {

	@Test(groups = "smokeTest")
	public void createOragnizationtc_01Test() throws EncryptedDocumentException, IOException {

		// *****************generate randum number
		int random_num = jlib.getrandomnumber();

		// ***************getDataFrom ExcelFile
		utilityclassobject.getTest().log(Status.INFO, "read data from excel");
		String orgname = elib.getDataFromExcel("org", 1, 2) + random_num;

		Homepage hp = new Homepage(driver);
		utilityclassobject.getTest().log(Status.INFO, "navigate to oranization page");
		hp.clickonOrganizationlink();// Click on Oraganization link on homepage

		Organizationspage op = new Organizationspage(driver);
		utilityclassobject.getTest().log(Status.INFO, "click on create oranization");
		op.getCreateOrgaBtn().click(); // click on create new organization btn in organization page

		CreatingNewOrganizationpage createNewOrg = new CreatingNewOrganizationpage(driver);
		createNewOrg.createOrgWithMandatoryField(orgname); // enter all organization mandatory details and save it
		utilityclassobject.getTest().log(Status.INFO, "oraganization created with mandatory field");

		// *************verify expected result Header msge

		OrganizationInformationpage orgInfoPage = new OrganizationInformationpage(driver);
		
		orgInfoPage.verifyHeaderInfo(orgname);// verify header
		orgInfoPage.verifyOrgName(orgname);// verify orgname

	}
	
	@Test(groups = "regressionTest")
	public void createOragnizationtc_02withIndustriesTest()throws IOException {
	

		
						
		
				//*****************generate randum number
				int random_num=jlib.getrandomnumber();

		//***************getDataFrom ExcelFile
				ListnerImple.test.log(Status.INFO, "read data from excel");

		String orgname=elib.getDataFromExcel("org",4,2)+random_num;
		String industry=elib.getDataFromExcel("org",4,3);
		String type=elib.getDataFromExcel("org",4,4);

	
		
		Homepage hp=new Homepage(driver);
		utilityclassobject.getTest().log(Status.INFO, "navigate to organization page");
		hp.clickonOrganizationlink();//Click on Oraganization link on homepage
        
		
		Organizationspage op=new Organizationspage(driver);
		op.getCreateOrgaBtn().click(); //click on create new organization btn in organization page		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		utilityclassobject.getTest().log(Status.INFO, "create new org");

		CreatingNewOrganizationpage createNewOrg=new CreatingNewOrganizationpage(driver);
		createNewOrg.createOrgWith_Org_Intdustry_TypeField(orgname, industry, type);
		utilityclassobject.getTest().log(Status.INFO, "organization created with industry and type");

		
		OrganizationInformationpage orgInfoPage=new OrganizationInformationpage(driver);
		orgInfoPage.verifyIndustryInfo(industry);//verify Industry
		orgInfoPage.verifyTypeInfo(type);//verify Type
		
		
	}
	
	@Test(groups = "regressionTest")
	public void createorganizationtc_03WithPhoneNumberTest()throws IOException {
		
				//*****************generate randum number
				int random_num=jlib.getrandomnumber();

		
		//***************getDataFrom ExcelFile
				
				ListnerImple.test.log(Status.INFO, "read data from excel");

				String orgname=elib.getDataFromExcel("org",7,2)+random_num;
				String phoneNumber=elib.getDataFromExcel("org",7,3);
		
		
	
		
				Homepage hp=new Homepage(driver);
		hp.clickonOrganizationlink();//Click on Oraganization link on homepage
		utilityclassobject.getTest().log(Status.INFO, "navigate to organization page");

		Organizationspage op=new Organizationspage(driver);
		op.getCreateOrgaBtn().click(); //click on create new organization btn in organization page		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		utilityclassobject.getTest().log(Status.INFO, "create new org");

		CreatingNewOrganizationpage createNewOrg=new CreatingNewOrganizationpage(driver);
		createNewOrg.createOrgWith_Org_Phone(orgname, phoneNumber);//create org with phonenumber
		utilityclassobject.getTest().log(Status.INFO, " org created with phone number");

	
		
		//************* verify expected result Phone Number 
		OrganizationInformationpage orgInfoPage=new OrganizationInformationpage(driver);
		orgInfoPage.verifyPhone(phoneNumber);
		utilityclassobject.getTest().log(Status.INFO, "verification of org");

		
		
		
	}

	
	@Test(groups = "regressionTest")
	public void deleteOrgTest()throws IOException {
	
		//*****************generate randum number
		int random_num=jlib.getrandomnumber();
		
		//***************getDataFrom ExcelFile
		String orgname=elib.getDataFromExcel("org",10,2)+random_num;
				
		
		
	
		
		
		Homepage hp=new Homepage(driver);
		hp.clickonOrganizationlink();//Click on Oraganization link on homepage
        
		Organizationspage op=new Organizationspage(driver);
		op.getCreateOrgaBtn().click(); //click on create new organization btn in organization page
		
		CreatingNewOrganizationpage createNewOrg=new CreatingNewOrganizationpage(driver);
		createNewOrg.createOrgWithMandatoryField(orgname); //enter all organization mandatory details and save it
		
		//*************verify expected result Header msg
		
		OrganizationInformationpage orgInfoPage=new OrganizationInformationpage(driver);
		orgInfoPage.verifyHeaderInfo(orgname);//verify header
		orgInfoPage.verifyOrgName(orgname);//verify orgname
		
		//go back to Organization link
		hp.clickonOrganizationlink();
		//search for Organization
		op.getSearchOrgEdt().sendKeys(orgname);
		wlib.select(op.getSearchDD(),"Organization Name");
		op.getSearchBtn().click();
		//In dynamic web table select and delete org 
		driver.findElement(By.xpath("//a[text()='"+orgname+"']/../../td[8]/a[text()='del']")).click();
		//confirm delete
		wlib.switchToalertAndAccept(driver);
		
		
	}

}
