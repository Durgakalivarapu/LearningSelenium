package com.Amokart.generic.excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Amokart.generic.common.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant {
		
		FileInputStream fis;
		Workbook book;
		FileOutputStream  fos;
		public ReadExcelFile() {
			// TODO Auto-generated constructor stub
		}
		
		public String readdata(String sheet, int row, int column)
		{
			//Convert the physical Excel File Into Java Understandable
			
			try {
				fis = new FileInputStream(Excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//create the workbook
			try {
				book = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//UsingWorkbook go to Sheet.row,column and cell fetch the data
			String data=book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
			
			return data;
		}
		
	     public void writedata(String sheet, int row, int column,String data)
	     {

	 		try {
	 			fis = new FileInputStream(Excelpath);
	 		} catch (FileNotFoundException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	    	 
	    	//create a new column and write data
				book.getSheet(sheet).getRow(row).getCell(column).setCellValue(data);
				
				//update the existing data in excel
			//	book.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("reshma");
				
				//convert java into  physical file
				try {
					fos = new FileOutputStream(Excelpath);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//write the data
				try {
					book.write(fos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//close the workbook
				try {
					book.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	     }
	     
	     public void displaydata(String sheet, int row, int column)
	     {
	    	 try {
	 			fis = new FileInputStream("./src/test/resources/Exceldata.xlsx");
	 		} catch (FileNotFoundException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	 		
	 		//create the workbook
	 		
	 		
	 			try {
					book = WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 		
	 		//UsingWorkbook go to Sheet.row,column and cell fetch the data
	 		String data=book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
	 		System.out.println(data);
	 		 
	    	 
	     }
	      
	     
	     public void displaymultipledata(String sheet, int column) throws EncryptedDocumentException, IOException
	     
	     {
	    	 
	    	//Convert the physical Excel File Into Java Understandable
	 		
	 		try {
	 			fis = new FileInputStream(Excelpath);
	 		} catch (FileNotFoundException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	 		
	 		//create the workbook
	 		book = WorkbookFactory.create(fis);
	 		
	    	//Using  Workbook go to sheet
	 		Sheet sheet1=book.getSheet(sheet);
	 		
	 		int count=sheet1.getLastRowNum();
	 		
	 		for(int i=1;i<=count;i++)
	 		{
	 			//optimized code
				 String data= book.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
			
	 		System.out.println(data);
	     }
	     
	}

}
