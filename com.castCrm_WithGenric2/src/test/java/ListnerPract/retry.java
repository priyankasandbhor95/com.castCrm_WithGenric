package ListnerPract;

import org.testng.Assert;
import org.testng.annotations.Test;

import testngPractice_base_utility.BaseconfigClass;

public class retry extends BaseconfigClass {
	@Test(retryAnalyzer = com.practice.list_crm_Listnerutility.retryAnalyzerImp.class)
	public void activesim()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "login");
	}

}
