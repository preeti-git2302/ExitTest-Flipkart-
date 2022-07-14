package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlipKartFunctionButtonsPage {
	
	WebDriver driver;
	Actions action;
	public FlipKartFunctionButtonsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[2]")
	public WebElement AboutUs;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[1]")
	public WebElement ContactUs;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/a[1]/span[1]")
	public WebElement viewAll;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[2]/a[3]")
	public WebElement cancellationAndRefund;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/p")
	public WebElement MoreDetails;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[4]/a[2]")
	public WebElement SocialMedia;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[3]/a[2]")
	public WebElement Policy;


	public void clickOnAboutUs() throws InterruptedException{
	        action.moveToElement(AboutUs).perform();
	        Thread.sleep(5000);
	        AboutUs.click();            
	}
	
	public void clickOnContactUs() throws InterruptedException {
		action.moveToElement(ContactUs).perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ContactUs);
        Thread.sleep(5000);
	}

	public void clickonViewAll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", viewAll);
		Thread.sleep(5000);
	}
	
	public void clickonCancellationAndRefund() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", cancellationAndRefund);
		Thread.sleep(5000);
	}
	
	public void clickOnMoreDetails() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", MoreDetails);
		Thread.sleep(5000);
	}
	
	public void clickOnSocialMedia() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", SocialMedia);
		Thread.sleep(5000);
	}
	
	public void clickOnPrivacy() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Policy);
		Thread.sleep(5000);
	}

}
