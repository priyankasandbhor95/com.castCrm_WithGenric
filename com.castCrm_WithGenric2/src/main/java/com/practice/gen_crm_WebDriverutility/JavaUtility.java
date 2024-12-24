package com.practice.gen_crm_WebDriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getrandomnumber()
	{
		Random random=new Random();
		int random_num= random.nextInt(5000);
		return random_num;
	}

	public String getSystemDateInYYYYMMDD()
	{
	
	Date dateobj=new Date();
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
	String date=sim.format(dateobj);
	
	
	return date;
	
	}
	
	public String getRequireDateYYYYMMDD(int days)
	{
		Date dateobj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		sim.format(dateobj);
        Calendar cal=sim.getCalendar();
        cal.add(Calendar.DAY_OF_MONTH,days);
        String requiredate=sim.format(cal.getTime());
        return requiredate;
        }
}
