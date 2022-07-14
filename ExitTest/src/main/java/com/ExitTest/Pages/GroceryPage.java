package com.ExitTest.Pages;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GroceryPage {
	
	WebDriver driver;
	Actions action;
	public GroceryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img")
	public WebElement Grocery;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]")
	public WebElement pincode;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")
	public WebElement pincodeenter;
    
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div[7]/div/div[1]/div/div/a/div")
	public WebElement Product;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/a/div/div")
	public WebElement selectGheesOil;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"swatch-1-quantity\"]/a")
	public WebElement SelectGhee;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]")
	public WebElement PriceLowToHigh;
	

	public void clickOnGrocery() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Grocery);
	}
	
	public void clickOnpincode(String pin) {
		//action.moveToElement(pincode).perform();
		pincodeenter.sendKeys(pin);
	}

//	public void clickOnpincodeenter() {
//		
//	}
//	
	public void clickOnProduct() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", Product);
		//action.moveToElement(Product).perform();
		Product.click();
	}
	
	public void clickOnGheesOil() {
		selectGheesOil.click();
		//action.moveToElement(selectGheesOil).perform();
	}

	public void clickOnGhee() {
		SelectGhee.click();
	}

	public void clickOnPriceLowToHigh() {
		PriceLowToHigh.click();
	}

	

}
