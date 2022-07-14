package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.BeautyandToysPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class BeautyandToysTest extends BaseTest{
	
	@Test 
	public void BeautyandToys() {
		ReuseableMethod closealter = new ReuseableMethod();
		closealter.navigateToPage();
		BeautyandToysPage toys = new BeautyandToysPage(driver);
		toys.clickOnBeautyandToysOptions();
		toys.clickOnSoftToys();
		toys.clickOnNewestFirst();
		logger.info("Become A seller");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Soft Toys (सॉफ्ट टॉयज): Buy Soft Toys for Babies Online | Flipkart.com" );
		sa.assertAll();
	}


}
