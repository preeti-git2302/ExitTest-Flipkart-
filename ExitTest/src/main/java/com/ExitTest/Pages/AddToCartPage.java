package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	

	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[7]/a/div[1]/div/img")
	public WebElement Application;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div[5]/div/div[3]/a/div/div")
	public WebElement AirConditioner;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/a")
	public WebElement ViewAll;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	public WebElement SelectProduct;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"swatch-2-capacity_in_tons\"]/a")
	public WebElement selectTon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[6]/div/div[1]/div[1]/div[2]/div/div[2]/div/span")
	public WebElement changePin;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[8]/div[4]/div/div[2]/div[2]/div[2]/button")
	public WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[5]/div/div[5]/div/div[1]")
	public WebElement SaveForLater;
	
	public void clickOnApplicationButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Application);
	}
	public void clickOnAirConditioner() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", AirConditioner);
		Thread.sleep(5000);
	}
	
	public void clickOnViewAll() {
		ViewAll.click();	
	}
	public void clickOnProduct() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", SelectProduct);
		Thread.sleep(5000);
	}
	public void clickOnSelectTon() {
		selectTon.click();
	}
	public void clickOnChangePin() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", changePin);
		Thread.sleep(5000);
	}
	
	public void clickOnAddToCart() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addToCart);
	}
	
	public void clickOnSaveforlater() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", SaveForLater);
		
	}
	
}
