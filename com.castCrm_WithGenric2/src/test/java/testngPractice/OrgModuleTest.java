package testngPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.practice.gen_crm_Filebutility.ExcelUtility;
import com.practice.gen_crm_Filebutility.Fileutility;
import com.practice.gen_crm_WebDriverutility.JavaUtility;
import com.practice.gen_crm_WebDriverutility.WebDriverUtility;
import com.practice.obj_crm_ObjectReoputility.CreatingNewOrganizationpage;
import com.practice.obj_crm_ObjectReoputility.Homepage;
import com.practice.obj_crm_ObjectReoputility.Loginpage;
import com.practice.obj_crm_ObjectReoputility.OrganizationInformationpage;
import com.practice.obj_crm_ObjectReoputility.Organizationspage;

public class OrgModuleTest {
	@Test(dependsOnMethods = "modifyOrgTest")
	public void deleteOrgTest() throws IOException
	{
	System.out.println("organization deleted");
	}
	
@Test
public void createOrgTest()
{
	System.out.println("oragnization created");
	
}
@Test
public void modifyOrgTest()
{
	System.out.println("modify org");}

}
