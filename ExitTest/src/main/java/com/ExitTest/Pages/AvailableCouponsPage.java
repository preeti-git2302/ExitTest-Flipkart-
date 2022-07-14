package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AvailableCouponsPage {
	
	WebDriver driver;
	Actions action;
	public AvailableCouponsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Preeti')]")
	public WebElement Preeti;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[7]/a[1]")
	public WebElement Coupons;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[2]/a[1]/div/div[1]/div[1]")
	public WebElement couponsOption;
//	
//	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/form/div[3]/label[2]")
//	public WebElement Gender;

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
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", Preeti);
//		((JavascriptExecutor) driver ).executeScript("arguments[0].scrollIntoView(true);", Preeti);
//		Preeti.click();
    	//action.moveToElement(Preeti).perform();
       // action.moveToElement(menFootwear).perform();
		
	        action.moveToElement(Preeti).perform();
	        action.moveToElement(Coupons).perform();
	        Coupons.click();
	        Thread.sleep(2000);
	    
	}
	
	public void clickOnCoupons() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", Coupons);
		//Coupons.click();
	}

//	public void clickonEdit() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", Edit);
//	}
	public void clickonCouponsOption() {
		couponsOption.click();
	}
	
//	public void chooseGender() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", Gender);
//	}

}
