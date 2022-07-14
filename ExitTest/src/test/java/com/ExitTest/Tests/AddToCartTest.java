package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.AddToCartPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;


public class AddToCartTest extends BaseTest {
	ReuseableMethod nextWindow = new ReuseableMethod();
	@Test (enabled = true)
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
		logger.info("Product Added to Cart");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/tvs-and-appliances-new-clp-store?fm=neo%2Fmerchandising&iid=M_8f212afa-e77e-42f1-bb18-636dd58b1796_1_372UD5BXDFYS_MC.LO4IWVHA61BX&otracker=hp_rich_navigation_7_1.navigationCard.RICH_NAVIGATION_Appliances_LO4IWVHA61BX&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_7_L0_view-all&cid=LO4IWVHA61BX");
		sa.assertAll();
	}

}
