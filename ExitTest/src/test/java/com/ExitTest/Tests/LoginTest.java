package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Excel.Excel;
import com.ExitTest.Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	static Excel excel=new Excel();
    public static String email = excel.getCellData(1,3);
    public static String password = excel.getCellData(1,5);
    public static String email1 = excel.getCellData(2,3);
    public static String password1 = excel.getCellData(3,3);
    
	@Test (priority = 1 , enabled = true)
	public void validLogin() {
		LoginPage login = new LoginPage(driver);
		login.enterEmail(email);
		login.enterPassword(password);
		login.clickLogin();
		logger.info("User Is Successfully Logged in");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!" );
		sa.assertAll();
	}
	
	@Test (priority = 2 , enabled = true)
	public void invalidEmail() {
		LoginPage login = new LoginPage(driver);
		login.enterEmail(email1);
		login.enterPassword(password);
		login.clickLogin();
		logger.info("Email is Incorrect");
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/" );
		sa.assertAll();
	}
	
	@Test (priority = 3 , enabled = true)
	public void invalidPassword() {
		LoginPage login = new LoginPage(driver);
		login.enterEmail(email);
		login.enterPassword(password1);
		login.clickLogin();
		logger.info("Password Is Incorrect");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/" );
		sa.assertAll();
	}
	
	@Test (priority = 4 , enabled = true)
	public void blankEmail() {
		LoginPage login = new LoginPage(driver);
		login.enterEmail("");
		login.enterPassword(password1);
		login.clickLogin();
		logger.info("Please Enter Email(Blank Email)");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/" );
		sa.assertAll();
	}
	
	@Test (priority = 5 , enabled = true)
	public void blankPassword() {
		LoginPage login = new LoginPage(driver);
		login.enterEmail(email);
		login.enterPassword("");
		login.clickLogin();
		logger.info("Please Enter Password(Blank Pass)");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/" );
		sa.assertAll();
		
	}

}
