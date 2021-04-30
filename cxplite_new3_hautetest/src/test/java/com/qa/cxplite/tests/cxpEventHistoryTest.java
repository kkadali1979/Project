package com.qa.cxplite.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;
import com.qa.cxplite.pages.cxpEventHistoryPage;
import com.qa.cxplite.utils.TestBase1;

public class cxpEventHistoryTest extends TestBase1 {
	cxplite_dataprovider cxplitedataprovider;
	cxpEventHistoryPage eventhistory;

	@BeforeClass
	public void eventhistorysetup() {
		eventhistory = PageFactory.initElements(driver, cxpEventHistoryPage.class);
		cxplitedataprovider = new cxplite_dataprovider();
	}

	@DataProvider
	public Object[][] getEventNumber() {
		Object[][] data = cxplitedataprovider.getTestData("EventNumber");
		return data;
	}

	@Test(dataProvider = "getEventNumber", priority = 10)
	public void eventnumberSearch(String eventno) throws InterruptedException {
		new Actions(driver).moveToElement(eventhistory.homebutton).click().build().perform();
		// eventorder.homebutton.click();
		Thread.sleep(2000);
		String[] eventNumber = eventno.split("[.]");
		System.out.println("Created Event Number is: " + eventNumber[0]);
		eventhistory.editbox.clear();
		Thread.sleep(2000);
		eventhistory.editbox.sendKeys(eventNumber[0]);

		eventhistory.searchButton.click();
		Thread.sleep(2000);

		new Actions(driver).moveToElement(eventhistory.dhtml).build().perform();
		Thread.sleep(2000);
		new Actions(driver).moveToElement(eventhistory.Eventhistory).click().build().perform();
		Thread.sleep(3000);
		
	}

	@Test(priority = 11)
	public void eventhistorytabledata() throws InterruptedException {
		
		eventhistory.eventhistorytable();
		
	}
}
