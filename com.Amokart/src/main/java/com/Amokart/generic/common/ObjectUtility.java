package com.Amokart.generic.common;

import com.Amokart.generic.excelutility.ReadExcelFile;
import com.Amokart.generic.javautility.javautility;
import com.Amokart.generic.propertyfileutility.ReadPropertyFile;
import com.Amokart.generic.webdriverutility.WebdriverUtility;

public class ObjectUtility implements FrameworkConstant {
	ReadExcelFile excelobj;
	javautility javaobj;
	ReadPropertyFile rpfobj;
	WebdriverUtility wduobj;
	
public void objectCreation() {
	  excelobj = new ReadExcelFile();
	  javaobj = new javautility();
	  rpfobj = new ReadPropertyFile();
	  wduobj = new WebdriverUtility();
	
}

}
