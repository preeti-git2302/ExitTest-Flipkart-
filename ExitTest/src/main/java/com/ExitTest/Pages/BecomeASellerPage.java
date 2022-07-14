package com.ExitTest.Pages;

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
		BecomeASeller.click();
	}

	public void clickOnHowToRegister() {
		HowToRegister.click();
	}

	public void clickOnKnowMore() {
		KnowMore.click();
	}

	public void clickOnResources() {
		Resources.click();
	}

	public void clickOnSuccessStories() {
		 SuccessStories.click();
	}

}
