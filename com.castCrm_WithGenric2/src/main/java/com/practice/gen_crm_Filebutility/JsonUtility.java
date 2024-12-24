package com.practice.gen_crm_Filebutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
	
	public String getDataFromJsonFile(String Key) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser p1=new JSONParser();
		Object obj=p1.parse(new FileReader("./AppconfigData(commondata)/readjson.json"));
		
		JSONObject jsondata=(JSONObject) obj;
		String data=(String) jsondata.get(Key);
		return data;
	}

}
