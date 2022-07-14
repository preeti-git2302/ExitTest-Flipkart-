package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.RemoveItemFromCartPage;

public class RemoveItemFromCartTest extends BaseTest{
	
	@Test (priority = 1)
	public void RemoveToCart() {
	LoginTest login = new LoginTest();
	login.validLogin();
	RemoveItemFromCartPage remove = new RemoveItemFromCartPage(driver);
	remove.clickOnCart();
	remove.clickOnRemove();
	remove.clickOnSelectRemove();
	logger.info("Item Successfully Removed from cart");
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART" );
	sa.assertAll();
	
	}
	
	@Test (priority = 2)
	public void ItemNotExist() {
		LoginTest login = new LoginTest();
		login.validLogin();
		RemoveItemFromCartPage remove1 = new RemoveItemFromCartPage(driver);
		remove1.clickOnCart();
		remove1.clickOnRemoveOption();
		logger.info("Item does not exist");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART" );
		sa.assertAll();
		
	}
}
