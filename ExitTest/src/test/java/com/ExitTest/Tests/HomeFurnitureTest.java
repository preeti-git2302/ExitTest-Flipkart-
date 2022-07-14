package com.ExitTest.Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.HomeFurniturePage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class HomeFurnitureTest extends BaseTest {
	

	@Test 
	public void HomeFurniture() {
		ReuseableMethod closealter = new ReuseableMethod();
		closealter.navigateToPage();
		HomeFurniturePage furniture = new HomeFurniturePage(driver);
		furniture.clickOnHomeFurniture();
		furniture.clickOnBeds();
		logger.info("Become A seller");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!" );
		sa.assertAll();
		
	}
	
}
