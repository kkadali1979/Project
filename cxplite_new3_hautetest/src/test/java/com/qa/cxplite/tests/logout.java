package com.qa.cxplite.tests;


import org.testng.annotations.AfterTest;

import com.qa.cxplite.utils.TestBase1;

public class logout extends TestBase1{
	@AfterTest
public void teardown()
{
	driver.quit();
}
}
