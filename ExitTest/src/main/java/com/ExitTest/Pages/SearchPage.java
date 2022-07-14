package com.ExitTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	public WebElement Search;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	public WebElement SubmitButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")
	public WebElement productButton;
	
	public void clickSearchBox() {
		Search.click();	
	}
	
	public void enterInSearchBox(String search) {
		Search.sendKeys(search);
	}
	
	public void clickSubmit() {
		SubmitButton.click();
	}
	
	public void clickproduct() {
		productButton.click();
	}

}
