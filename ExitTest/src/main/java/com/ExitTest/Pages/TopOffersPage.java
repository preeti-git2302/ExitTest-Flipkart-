package com.ExitTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopOffersPage {
	
	WebDriver driver;
	public TopOffersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")
	public WebElement TopOffers;

	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[2]/a")
	public WebElement DealOfTheDay;
	

	public void clickOnTopOffers() {
		TopOffers.click();
	}

	public void clickOnDealOfTheDay() {
		DealOfTheDay.click();
	}

}
