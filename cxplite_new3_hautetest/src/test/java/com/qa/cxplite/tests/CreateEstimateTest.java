package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;
import com.qa.cxplite.pages.CreateEstimatesPage;
import com.qa.cxplite.utils.TestBase1;




public class CreateEstimateTest extends TestBase1{
	cxplite_dataprovider cxpLiteDataProvider;
	 CreateEstimatesPage createestimate;
	 
	 @BeforeClass
	public void CreateEstimates() {
	   createestimate = PageFactory.initElements(driver, CreateEstimatesPage.class);
	   cxpLiteDataProvider = new cxplite_dataprovider();
	}

	
	@DataProvider
	public Object[][] getEstimateData(){
		Object[][] data = cxpLiteDataProvider.getTestData("Estimates");
		return data;
	}
	@Test(priority = 6, dataProvider = "getEstimateData")
	public void validateCreateEstimates(String combo,String food, String alcohol, String non_alcoholic_beverages, String rental_equipment, String event_equipment,
			String disposables,String staffing) 
	{
		
		Assert.assertTrue(createestimate.createEstimates(combo,food,alcohol,non_alcoholic_beverages,rental_equipment,event_equipment,disposables,staffing));
	
	}
}
