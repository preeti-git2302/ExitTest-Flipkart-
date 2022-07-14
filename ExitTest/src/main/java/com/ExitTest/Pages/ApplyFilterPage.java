package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ApplyFilterPage {
	
	WebDriver driver;
	Actions action;
	public ApplyFilterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[1]/div")
	public WebElement Fashion;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[4]")
	public WebElement WesternWear;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[3]")
	public WebElement WomenDresses;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[3]/label[1]/div[1]")
	public WebElement Fassured;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]")
	public WebElement Rating;
	
	public void clickOnFashions() {
		action.moveToElement(Fashion).perform();
		action.moveToElement(WesternWear).perform();
	}
	
	public void clickOnDresses() {
		WomenDresses.click();
	}
	
	public void clickOnFassured() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Fassured);	
	}
	
	public void clickOnselectRating() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Rating);
	}

}
