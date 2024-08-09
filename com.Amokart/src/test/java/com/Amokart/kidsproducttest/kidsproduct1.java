package com.Amokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsproduct1 {

	
	@Test(priority = 3,dependsOnMethods = "addProduct",enabled = false,groups="Smoke")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Kids Product sucessfully",true);
	}
	
	@Test(priority = 2,dependsOnMethods = "addProduct",groups = "Functionality")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids Product sucessfully",true);
	}

	@Test(priority = 1,invocationCount = 2,groups = "integration")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids Product sucessfully",true);
	}
}
