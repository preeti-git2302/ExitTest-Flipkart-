package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.ViewWishListPage;


public class ViewWishListTest extends BaseTest {
	
	@Test 
	public void EditAccount() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		ViewWishListPage edit = new ViewWishListPage(driver);
		edit.clickOnOptions();
		logger.info("View WishList");
		
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/account" );
//		sa.assertAll();
	}

}
