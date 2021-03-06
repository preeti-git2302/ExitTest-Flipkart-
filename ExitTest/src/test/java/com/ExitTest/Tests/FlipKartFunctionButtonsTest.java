package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.FlipKartFunctionButtonsPage;

public class FlipKartFunctionButtonsTest extends BaseTest {
	
	@Test (priority = 1 , enabled = true)
	public void AboutUs() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		FlipKartFunctionButtonsPage buttons = new FlipKartFunctionButtonsPage(driver);
		buttons.clickOnAboutUs();
		logger.info("Display About Us");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/about-us?otracker=undefined_footer_navlinks" );
		sa.assertAll();
	}
	
	@Test (priority = 2 , enabled = true)
	public void ContactUs() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		FlipKartFunctionButtonsPage buttons = new FlipKartFunctionButtonsPage(driver);
		buttons.clickOnContactUs();
		logger.info("Contact Us Details");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/helpcentre?otracker=undefined_footer_navlinks" );
		sa.assertAll();
		
	}
	
	@Test (priority = 3 , enabled = true)
	public void CancellationAndRefund() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		FlipKartFunctionButtonsPage buttons = new FlipKartFunctionButtonsPage(driver);
		buttons.clickonCancellationAndRefund();
		buttons.clickOnMoreDetails();
		logger.info("Details about Cancellation And Refund");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com" );
		sa.assertAll();
	}
	
	@Test (priority = 4 , enabled = true)
	public void SocialMedia() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		FlipKartFunctionButtonsPage buttons = new FlipKartFunctionButtonsPage(driver);
		buttons.clickOnSocialMedia();
		logger.info("Social Media Handle Twitter");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/");
		sa.assertAll();
		
	}
	
	@Test (priority = 5 , enabled = true)
	public void policy() throws InterruptedException {
		LoginTest login = new LoginTest();
		login.validLogin();
		FlipKartFunctionButtonsPage buttons = new FlipKartFunctionButtonsPage(driver);
		buttons.clickOnPrivacy();
		logger.info("privacy");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/pages/terms?otracker=undefined_footer_navlinks" );
		sa.assertAll();
		
	}
}
