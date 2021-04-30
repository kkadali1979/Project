package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.cxplite.pages.cxpLoginPage;
import com.qa.cxplite.utils.TestBase1;

public class cxpLoginTest extends TestBase1 {

	@Test(priority = 1)
	@Parameters({ "catererID", "userName", "password" })
	public void validatelogin(String catererID, String userName, String password) throws Exception {

		cxpLoginPage cxp_login = PageFactory.initElements(driver, cxpLoginPage.class);
		String title_login = cxp_login.login(catererID, userName, password);
		Assert.assertEquals(title_login, "Superadmin Login", "Login Failed");

	}
}
