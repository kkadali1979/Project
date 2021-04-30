package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;
import com.qa.cxplite.pages.CreateEventPage;
import com.qa.cxplite.utils.TestBase1;





public class CreateEventTest extends TestBase1{
	CreateEventPage createevenetpage;
	cxplite_dataprovider cxplite_dataprovider ;
	CreateEventPage createevenet;
	
	@BeforeClass
	public void validateeventpage() {
		 createevenetpage = PageFactory.initElements(driver, CreateEventPage.class);
		  cxplite_dataprovider = new cxplite_dataprovider();

	}
	
	@DataProvider
	public Object[][] getCreateEventData() {
		Object[][] data = cxplite_dataprovider.getTestData("CreateEvent");
		return data;

	}

	@Test(priority = 4, dataProvider = "getCreateEventData")
	public void validateCreateEvent(String customerName, String Ae, String BeginDate, String BeginTime,
			String EndDate, String EndTime, String EventType, String EventStatus, String EventName, String EventTheme,
			String BusinessUnit, String PlatterType, String GuestCount, String County, String Homephone, String Email) throws InterruptedException 
	{
		  createevenet = PageFactory.initElements(driver, CreateEventPage.class);
		Assert.assertTrue(createevenet.createEventFromCustomer(customerName, Ae,  BeginDate,  BeginTime,
				 EndDate,  EndTime,  EventType,  EventStatus,  EventName,  EventTheme,
				 BusinessUnit,  PlatterType,  GuestCount,  County,  Homephone,  Email));
	}
	
	@DataProvider
	public Object[][] getEventNumber() {
		Object[][] data= cxplite_dataprovider.getTestData("EventNumber");
		return data;
	}
	
	@Test(priority = 5, dataProvider = "getEventNumber")
	public void serachEventTest(String eventNumber) throws Exception {
		try {
			

		Assert.assertTrue(createevenetpage.searchEvent(eventNumber));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}

