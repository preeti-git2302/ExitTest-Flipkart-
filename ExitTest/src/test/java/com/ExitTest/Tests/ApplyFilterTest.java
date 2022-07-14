package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.ApplyFilterPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class ApplyFilterTest extends BaseTest {

	@Test  (enabled = true)
	public void ApplyFilter() {
		ReuseableMethod closealter = new ReuseableMethod();
		closealter.navigateToPage();
		ApplyFilterPage filter = new ApplyFilterPage(driver);
		filter.clickOnFashions();
		filter.clickOnDresses();
		filter.clickOnFassured();
		filter.clickOnselectRating();
        logger.info("All Filter Applied and Result displayed");		
        
        SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Buy Dresses Online (ड्रेसेस) For Women Online | Free Shipping" );
		sa.assertAll();
	}
	
}