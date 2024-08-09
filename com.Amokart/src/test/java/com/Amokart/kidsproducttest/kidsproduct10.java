package com.Amokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsproduct10 {

	
	@Test(invocationCount = 2,groups = "integration")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids Product sucessfully",true);
	}
	
	@Test(invocationCount = 2,groups = "Functionality")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids Product sucessfully",true);
	}
	@Test(invocationCount = 2,groups = "smoke")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Kids Product sucessfully",true);
	}
}
