package com.ExitTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public WebElement Email;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	public WebElement Password;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	public WebElement LoginButton;
	
	
	public void enterEmail(String user) {
		Email.sendKeys(user);
	}

	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}

	public void clickLogin() {
		LoginButton.click();
	}


}
