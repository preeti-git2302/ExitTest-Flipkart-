package com.ExitTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeFurniturePage {

	WebDriver driver;
	Actions action;
	public HomeFurniturePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[1]/div[1]/img[1]")
	public WebElement HomeFurniture;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[5]")
	public WebElement BedroomsFurniture;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[3]")
	public WebElement Beds;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]")
	public WebElement NewestFirst;
	
//	@FindBy(how = How.XPATH, using = "//a[contains(@class,'_2rpwqI')]//img[contains(@alt,'- 60 cm')]")
//	public WebElement openproduct;
//	

	public void clickOnHomeFurniture() {
		action.moveToElement(HomeFurniture).perform();
		action.moveToElement(BedroomsFurniture).perform();
		//action.moveToElement(BedroomsFurniture).perform();
		
		
	}
	public void clickOnBeds() {
		Beds.click();
	}

	public void clickOnNewestFirst() {
		NewestFirst.click();
	}
}
