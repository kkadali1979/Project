package com.qa.cxplite.tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;
import com.qa.cxplite.pages.CreateEventOrder;
import com.qa.cxplite.pages.CreateEventPage;
import com.qa.cxplite.utils.TestBase1;

public class CreateEventOrderTest extends TestBase1{
	
	cxplite_dataprovider cxplitedataprovider;
	CreateEventOrder eventorder;
	
	@BeforeClass
	public void eventordersetup()
	{
		 eventorder = PageFactory.initElements(driver, CreateEventOrder.class);
		// evorder= PageFactory.initElements(driver, CreateEventPage.class);
		 cxplitedataprovider = new cxplite_dataprovider();		 
	}
	
	@DataProvider
	public Object[][] getEventOrder(){
		Object[][] data = cxplitedataprovider.getTestData("EventOrder");
		return data;
	}
	
	@DataProvider
	public Object[][] getEventNumber(){
		Object[][] data = cxplitedataprovider.getTestData("EventNumber");
		return data;
	}
	
	
	
	@Test(dataProvider="getEventNumber",priority=7)
	public void eventnumberSearch(String eventno) throws InterruptedException
	{
		new Actions(driver).moveToElement(eventorder.homebutton).click().build().perform();
		// eventorder.homebutton.click();
		 Thread.sleep(2000);
		 String[] eventNumber = eventno.split("[.]");
			//System.out.println("Created Event Number is: " + eventNumber[0]);
			eventorder.editbox.clear();
			Thread.sleep(2000);
			eventorder.editbox.sendKeys(eventNumber[0]);
		 
		 eventorder.searchButton.click();
		 Thread.sleep(2000);
		 
		 new Actions(driver).moveToElement(eventorder.dhtml).build().perform();
		 Thread.sleep(2000);
		 new Actions(driver).moveToElement(eventorder.event_order).click().build().perform();
		 Thread.sleep(3000);
	}
	
	
	@Test(dataProvider="getEventOrder",priority=8)
	
	public void add_menu( String Food, String Alcohol, String Non_Alcoholic_Beverages, String Rental_Equipment,
			String Event_Equipment,String Disposables,String Staffing) throws Exception
	{
		
	
		
		eventorder.add_food(Food);
		eventorder.add_alcohol(Alcohol);
		eventorder.add_non_alcoholic_beverages(Non_Alcoholic_Beverages);
		eventorder.add_rental_Equipment(Rental_Equipment);
		eventorder.add_Event_Equipment(Event_Equipment);
		 eventorder.add_Disposables(Disposables);
		 eventorder.add_Staffing(Staffing);
		 eventorder.add_collection();
		 eventorder.add_package();
		eventorder.add_combo();
	}

}
