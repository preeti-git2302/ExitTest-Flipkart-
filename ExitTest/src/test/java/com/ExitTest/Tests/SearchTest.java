package com.ExitTest.Tests;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Excel.Excel;
import com.ExitTest.Pages.SearchPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class SearchTest extends BaseTest {
	ReuseableMethod closealter = new ReuseableMethod();
	static Excel excel=new Excel();
    public static String search = excel.getCellData(4,1);
    public static String incorrectsearch = excel.getCellData(5,1);
    
	
	@Test (priority = 1 , enabled = true)
	public void search() {
		closealter.navigateToPage();
		SearchPage startsearch = new SearchPage(driver);
		startsearch.clickSearchBox();
		startsearch.enterInSearchBox(search);
		startsearch.clickSubmit();
		startsearch.clickproduct();
		logger.info("Product Found");
        
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Iphone12- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		sa.assertAll();
	}
	
	@Test (priority = 2 , enabled = true)
	public void invalidSearch() {
		closealter.navigateToPage();
		SearchPage startsearch = new SearchPage(driver);
		startsearch.clickSearchBox();
		startsearch.enterInSearchBox(incorrectsearch);
		startsearch.clickSubmit();
		logger.info("Product not found");
        
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		sa.assertAll();
	}
	
	
	
}
