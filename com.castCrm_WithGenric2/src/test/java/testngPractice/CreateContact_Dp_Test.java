package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_Dp_Test {
	@Test(dataProvider = "getData")
	public void createContactTest(String fname,String lname,long ph)
	{
		System.out.println("Firstname:"+fname+"Lastname"+lname+"phone:"+ph);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][3];
		
		obj[0][0]="Deepak";
		obj[0][1]="HR";
		obj[0][2]=98564756l;
		
		obj[1][0]="sam";
		obj[1][1]="HD";
		obj[1][2]=564789564l;

		obj[2][0]="stev";
		obj[2][1]="john";
		obj[2][2]=64897598l;

		

		return obj;
		
	}

}
