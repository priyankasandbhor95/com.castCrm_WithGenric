package ListnerPract;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testngPractice_base_utility.BaseconfigClass;
@Listeners(com.practice.list_crm_Listnerutility.ListnerImple.class)
public class Listner_Invoice_PractTest extends BaseconfigClass {
	
	@Test
	public void createInvoiceTest()
	{
		System.out.println("execute createInvoiceTest");
		String title=driver.getTitle();
		Assert.assertEquals(title, "login");
		
	}

	@Test
	public void createInvoiceWithContactTest()
	{
		System.out.println("execute createInvoiceWithContactTest");

	}

}
