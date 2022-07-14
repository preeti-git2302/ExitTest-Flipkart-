package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BecomeASellerPage {
	
	WebDriver driver;
	public BecomeASellerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/a")
	public WebElement BecomeASeller;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[2]/div[3]/div/div[2]/div[2]/div/div/div[2]/div[2]/button")
	public WebElement HowToRegister;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[2]/div[4]/div/div/a")
	public WebElement KnowMore;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/ul/li[3]/a")
	public WebElement Resources;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/a[2]/div/div[2]")
	public WebElement SuccessStories;
	

	public void clickOnBecomeASeller() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", BecomeASeller);
	}

	public void clickOnHowToRegister() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", HowToRegister);
	}

	public void clickOnKnowMore() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", KnowMore);
	}

	public void clickOnResources() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Resources);
	}

	public void clickOnSuccessStories() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", SuccessStories);
	}

}
