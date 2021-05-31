package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;
import com.qa.cxplite.pages.Create_billservice;
import com.qa.cxplite.utils.TestBase1;

public class createbillservicetest extends TestBase1{
	Create_billservice createbillservice;
	cxplite_dataprovider cxplite_dataprovider;
	
	
	
	@BeforeClass
	public void billservicesetup()
	{
		createbillservice = PageFactory.initElements(driver, Create_billservice.class);
	
	}
	
	
	@Test
	public void bill_service() throws InterruptedException
	{
		
		createbillservice.makebill();
			Thread.sleep(3000);
	}
}
