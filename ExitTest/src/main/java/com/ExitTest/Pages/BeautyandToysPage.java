package com.ExitTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BeautyandToysPage {
	
	WebDriver driver;
	Actions action;
	public BeautyandToysPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div/div/div[9]/a/div[1]")
	public WebElement BeautyandToysOptions;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[6]")
	public WebElement Toys;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[3]")
	public WebElement SoftToys;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]")
	public WebElement NewestFirst;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class,'_2rpwqI')]//img[contains(@alt,'- 60 cm')]")
	public WebElement openproduct;
	

	public void clickOnBeautyandToysOptions() {
		action.moveToElement(BeautyandToysOptions).perform();
		action.moveToElement(Toys).perform();
		
	}

	public void clickOnSoftToys() {
		SoftToys.click();
	}

	public void clickOnNewestFirst() {
		NewestFirst.click();
	}

	public void clickOnProduct() {
		openproduct.click();
	}

}



