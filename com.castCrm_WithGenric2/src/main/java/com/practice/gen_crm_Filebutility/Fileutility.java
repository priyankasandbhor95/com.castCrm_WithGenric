package com.practice.gen_crm_Filebutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {

	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./AppconfigData(commondata)/ddtpractice.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String data=pro.getProperty(key);
		return data;
	}
}
