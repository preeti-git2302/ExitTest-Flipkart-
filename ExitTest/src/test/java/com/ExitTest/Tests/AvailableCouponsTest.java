package com.ExitTest.Tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.AvailableCouponsPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class AvailableCouponsTest extends BaseTest {
	
	@Test 
	public void AvailableCoupons() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		AvailableCouponsPage coupons = new AvailableCouponsPage(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		coupons.clickOnOptions();
		//coupons.clickOnCoupons();
		coupons.clickonCouponsOption();
		logger.info("Become A seller");
		
	}
}
