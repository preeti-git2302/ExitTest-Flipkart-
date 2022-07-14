package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewWishListPage {
	
	WebDriver driver;
	Actions action;
	public ViewWishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
		
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Preeti')]")
	public WebElement MyName;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[5]/a[1]/div[1]")
	public WebElement WishList;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]")
	public WebElement Edit;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/label[2]/div[1]")
	public WebElement Gender;

//	@FindBy(how = How.XPATH, using = "_3vhnxf")
//	public WebElement coupons;
//
//	@FindBy(how = How.CLASS_NAME, using = "_3vhnxf")
//	public WebElement coupons;

	
	
//	public void enterEmail(String user) {
//		Email.sendKeys(user);
//	}
//
//	public void enterPassword(String pass) {
//		Password.sendKeys(pass);
//	}

	public void clickOnOptions() throws InterruptedException {
		action.moveToElement(MyName).perform();
        action.moveToElement(WishList).perform();
       // WishList.click();
        Thread.sleep(2000);
		
	}


}
