package com.ExitTest.ReuseableMethod;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.ExitTest.BaseClass.BaseTest;

public class ReuseableMethod extends BaseTest {
	
	public void switchWindow() {
		 Set<String> handles = driver.getWindowHandles();
		    String currentHandle = driver.getWindowHandle();
		    for (String handle : handles) {
		     if (!handle .equals(currentHandle))
		     {
		         driver.switchTo().window(handle);
		     }
		   }    
	}
	
	public void navigateToPage() {
		driver.navigate().to(prop.getProperty("url"));
		Actions actions = new Actions(driver);
		Action action = actions.sendKeys(Keys.ESCAPE).build();
		action.perform();
	}
	
	public void scrollDown() {
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

}
