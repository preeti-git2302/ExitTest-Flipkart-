package com.ExitTest.Tests;

import java.util.Set;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.AddToCartPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;


public class AddToCartTest extends BaseTest {
	ReuseableMethod nextWindow = new ReuseableMethod();
	@Test 
	public void addToCart() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		AddToCartPage itemAddedToCart = new AddToCartPage(driver);
		itemAddedToCart.clickOnApplicationButton();
		nextWindow.scrollDown();
		itemAddedToCart.clickOnAirConditioner();
		itemAddedToCart.clickOnViewAll();
		itemAddedToCart.clickOnProduct();
		nextWindow.switchWindow();
		itemAddedToCart.clickOnAddToCart();
		//itemAddedToCart.clickOnSaveforlater();
		logger.info("Product Added to Cart");
		
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(driver.getCurrentUrl(), "https://www.amazon.inn");
//		System.out.println("over all testcases fails if one of a test case fail");
//		sa.assertEquals(driver.getTitle(), "Two-Step Verification");
//		sa.assertAll();
	}

}
