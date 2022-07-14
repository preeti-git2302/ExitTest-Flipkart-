package com.ExitTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsItemPage {
	
	WebDriver driver;
	Actions action;
	public ElectronicsItemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[1]/div")
	public WebElement Electronics;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[8]")
	public WebElement LaptopsAndDesktop;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[2]")
	public WebElement Laptops;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div[7]/div/div/div/div[1]/div/div[6]/div/a/div")
	public WebElement Apple;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")
	public WebElement Products;


	public void clickOnElectronics() {
		action.moveToElement(Electronics).perform();
		action.moveToElement(LaptopsAndDesktop).perform();
	}

	public void clickOnLaptops() {
		Laptops.click();
	}
	
	public void clickOnApple() {
		Apple.click();
	}
	
	public void clickOnProducts() {
		Products.click();
	}

}
