package com.Amokart.generic.propertyfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Amokart.generic.common.FrameworkConstant;

public class ReadPropertyFile implements FrameworkConstant {
	
		
		FileInputStream fis;
		FileOutputStream fos;
		Properties p;
		
		public String readdata(String key)
		{
			//Convert the physical file into java understandable
			try {
				fis=new FileInputStream(Propertypath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//creating instance for property class
			p=new Properties();
			
			//Load the all common data
			try {
				p.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Fetch the data
			String data=p.getProperty(key);;
			
			return data;
		}
		
	public void writeData(String key,String value) 
	{
		//enter the data
		p.put(key, value);
		
		//create instance for File output Stream
		try {
			fos=new FileOutputStream(Propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Store the data
		try {
			p.store(fos, "updated the new key value successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void displaydata(String key)
	{

		//Convert the physical file into java understandable
		try {
			fis=new FileInputStream(Propertypath);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//creating instance for property class
		p=new Properties();
		
		//Load the all common data
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Fetch the data
		String data=p.getProperty(key);
		
		//print on console
		System.out.println(data);
	}
	}



