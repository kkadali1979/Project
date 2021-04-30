package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.cxplite.pages.cxpHomepage;
import com.qa.cxplite.utils.TestBase1;


public class ValidateHomePageTest extends TestBase1  {
	@Test(priority=2)
	public void validatehomepage() throws InterruptedException
	{
	 cxpHomepage cxp_homepage = PageFactory.initElements(driver, cxpHomepage.class);
	 
		String homepage_title=cxp_homepage.validatehomepage();	
		
		Assert.assertEquals(homepage_title, "Event Listing");
	}

}
