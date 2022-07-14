package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.BecomeASellerPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class BecomeASellerTest extends BaseTest {
	
	@Test 
	public void BecomeASeller() {
		ReuseableMethod closealter = new ReuseableMethod();
		closealter.navigateToPage();
		BecomeASellerPage seller = new BecomeASellerPage(driver);
		seller.clickOnBecomeASeller();
		seller.clickOnHowToRegister();
		seller.clickOnKnowMore();
		seller.clickOnResources();
		seller.clickOnSuccessStories();
		logger.info("Become A seller");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://seller.flipkart.com/sell-online/resources/seller-success-stories" );
		sa.assertAll();
	}

}
