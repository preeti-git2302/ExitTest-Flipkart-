package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.ElectronicsItemPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class ElectronicsItemTest extends BaseTest {
	
	@Test 
	public void ElectronicsItem() {
		ReuseableMethod closealter = new ReuseableMethod();
		closealter.navigateToPage();
		ElectronicsItemPage electronics = new ElectronicsItemPage(driver);
		electronics.clickOnElectronics();
		electronics.clickOnLaptops();
		electronics.clickOnApple();
		logger.info("Electronics Items");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Laptops - Biggest Deals on Laptops Online at Best Price in India | Flipkart.com" );
		sa.assertAll();
	}

}
