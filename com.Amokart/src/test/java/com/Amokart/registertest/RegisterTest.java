package com.Amokart.registertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amokart.generic.common.BaseClass;

@Listeners(com.Amokart.generic.listenerutility.Listeners.class)
public class RegisterTest extends BaseClass {

	@Test(enabled = false)

	public void createUser_validData() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verify page using Assert
		String exp_title = "LEarning WEB TECHNOLOGY FORMS";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title);

		// Step 1: enter the name in the text field
		WebElement name = driver.findElement(By.id("name"));
		name.clear();
		name.sendKeys("Reshma");

		Reporter.log("createUser_validData for registerTest", true);
	}

	@Test(dataProvider = "register")
	public void createUser_invalidData(String name, String email, String password) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Step1:Identify name TextField and Enter data
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Step2:Identify the EmailtextField  and Enter data
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Step3:Identify the Password  and Enter data
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	
		System.out.println("Name :" + name);
		System.out.println("Email:" + email);
		System.out.println("Password:" + password);
		Reporter.log("createUser_invalidData for registerTest", true);
//			Assert.fail();
	}

}