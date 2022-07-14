package com.ExitTest.Tests;

import org.testng.annotations.Test;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.GroceryPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class GroceryTest extends BaseTest {

	@Test
	public void Grocery() {
		LoginTest login = new LoginTest();
		login.validLogin();
		GroceryPage grocery = new GroceryPage(driver);
		grocery.clickOnGrocery();
		//grocery.clickOnpincode("122018");
//		grocery.clickOnpincodeenter("122018");
		grocery.clickOnProduct();
		grocery.clickOnGheesOil();
		grocery.clickOnGhee();
	//	grocery.clickOnPriceLowToHigh();
		logger.info("Grocery Section Product");
	}
}
