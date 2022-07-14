package com.ExitTest.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ExitTest.BaseClass.BaseTest;
import com.ExitTest.Pages.TopOffersPage;
import com.ExitTest.ReuseableMethod.ReuseableMethod;

public class TopOffersTest extends BaseTest {

	@Test 
	public void TopOffers() {
		ReuseableMethod closealter = new ReuseableMethod();
		closealter.navigateToPage();
		TopOffersPage offers = new TopOffersPage(driver);
		offers.clickOnTopOffers();
		offers.clickOnDealOfTheDay();
		logger.info("See The Top Offers");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), "https://www.flipkart.com/dotd-store?=Web&wid=1.dealCard.OMU_1&otracker=clp_omu_Deals%2Bof%2Bthe%2BDay_offers-store_1&otracker1=clp_omu_PINNED_neo%2Fmerchandising_Deals%2Bof%2Bthe%2BDay_NA_wc_view-all_1" );
		sa.assertAll();
	}
		
}
