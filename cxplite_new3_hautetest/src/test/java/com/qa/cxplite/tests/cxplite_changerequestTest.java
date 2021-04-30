package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.cxplite.pages.cxplite_changerequest;
import com.qa.cxplite.utils.TestBase1;

public class cxplite_changerequestTest extends TestBase1 {
	cxplite_changerequest changerequest;
	@BeforeClass
	public void change_request()
	{
		 changerequest = PageFactory.initElements(driver, cxplite_changerequest.class);
	}
@Test(priority=9)
public void changerequest() throws InterruptedException
{
	try{
	changerequest.cr_changerequest("3", "Add");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
