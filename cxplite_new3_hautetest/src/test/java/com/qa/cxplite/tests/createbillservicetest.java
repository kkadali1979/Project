package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.qa.cxplite.pages.Create_billservice;
import com.qa.cxplite.utils.TestBase1;

public class createbillservicetest extends TestBase1{
	Create_billservice createbillservice;
	
	
	@BeforeClass
	public void billservicesetup()
	{
		createbillservice = PageFactory.initElements(driver, Create_billservice.class);
	
	}
	
	@Test
	public void bill_service()
	{
		try 
		
		{
			createbillservice.makebill();	
			Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

}
