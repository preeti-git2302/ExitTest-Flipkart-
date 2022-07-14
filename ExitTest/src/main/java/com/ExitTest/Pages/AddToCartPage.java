package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
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
	
//	@FindBy(how = How.NAME, using = "password")
//	public WebElement password;
//	
//	@FindBy(how = How.ID, using = "signInSubmit")
//	public WebElement signInSubmitButton;
	
	
	public void clickOnApplicationButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Application);
		//Application.click();
	}
	public void clickOnAirConditioner() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", AirConditioner);
		//AirConditioner.click();	
	}
	
	public void clickOnViewAll() {
		ViewAll.click();	
	}
	public void clickOnProduct() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", SelectProduct);
		//SelectProduct.click();
	}
	public void clickOnSelectTon() {
		selectTon.click();
	}
	public void clickOnChangePin() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", changePin);
		//changePin.click();
	}
	
	public void clickOnAddToCart() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addToCart);
		//addToCart.click();
	}
	
	public void clickOnSaveforlater() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", SaveForLater);
		//selectPin.click();
	}
//	public void enterpassword(String pass) {
//		password.sendKeys(pass);
//	}
//	public void clicksubmit() {
//		signInSubmitButton.click();
//	}
	


}
