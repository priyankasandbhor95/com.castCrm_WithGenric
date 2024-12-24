package com.practice.gen_crm_WebDriverutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class date_pract {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

       /*  Date dateobj=new Date();
		
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String startdate=sim.format(dateobj);
		System.out.println(startdate);
        Calendar cal=sim.getCalendar();
        cal.add(Calendar.DAY_OF_MONTH,30);
        String enddate=sim.format(cal.getTime());
        System.out.println(enddate);*/
		
		/*
		 * //// FileInputStream fis=new
		 * FileInputStream("./TestScriptData/report1.xlsx"); //// Workbook
		 * wb=WorkbookFactory.create(fis); //// Cell cell=
		 * wb.getSheet("org").getRow(7).createCell(4); ////
		 * cell.setCellType(CellType.STRING); //// cell.setCellValue("pass"); ////
		 * FileOutputStream fos=new FileOutputStream("./TestScriptData/report1.xlsx");
		 * //// wb.write(fos); //// wb.close(); //
		 */		
		
		
//		FileInputStream fis=new FileInputStream("./TestScriptData/report1.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//	     Cell c1= wb.getSheet("org").getRow(7).createCell(4);
//		c1.setCellType(CellType.STRING);
//		c1.setCellValue("pass");
//		FileOutputStream fos=new FileOutputStream("./TestScriptData/report1.xlsx");
//		wb.write(fos);

		//wb.close();
	}

}
