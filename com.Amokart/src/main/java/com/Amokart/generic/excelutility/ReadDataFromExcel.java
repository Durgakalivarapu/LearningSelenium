package com.Amokart.generic.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
public static void main(String[] args) {
		
		//convert the physical Excel file into java Understandable
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/src/test/resources/data/Waste Excel.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create the workbook;
		Workbook book = null;
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Using  Workbook go to sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		int count=sheet.getLastRowNum();
		
		for(int i=1;i<=count;i++)
		{
			
//			//using  sheet go to row
//			Row r=sheet.getRow(i);
//			
//			//Using row go to the cell
//			Cell c=r.getCell(0);
//			
//			//using cell go to data
//			String data=c.getStringCellValue();
			
			//optimized code
			 String data1= book.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		}
		
		
	}

}
