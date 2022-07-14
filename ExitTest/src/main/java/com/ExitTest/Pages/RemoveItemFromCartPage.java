package com.ExitTest.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RemoveItemFromCartPage {
	
	WebDriver driver;
	public RemoveItemFromCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a")
	public WebElement Cart;
	
	@FindBy(how = How.XPATH, using = "//div[@class='nZz3kj _1hNI6F']//div[1]//div[2]")
	public WebElement Remove;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div[1]")
	public WebElement SelectRemove;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[6]/div/div[2]/div[2]/div[2]")
	public WebElement NotExist;
	
	public void clickOnCart() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Cart);
	}
	
	public void clickOnRemove() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Remove);
	}
	
	public void clickOnSelectRemove() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", SelectRemove);
	}
	
	public void clickOnRemoveOption() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", NotExist);
	}
	

}
