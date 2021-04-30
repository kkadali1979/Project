package com.qa.cxplite.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;
import com.qa.cxplite.pages.cxpCreateCustomerPage;
import com.qa.cxplite.utils.TestBase1;

public class cxpCreateCustomerTest extends TestBase1 {
	cxpCreateCustomerPage createcustomerpage;
	cxplite_dataprovider cxplitedataprovider;
@BeforeClass
	public void validatecreatecustomer() {
		createcustomerpage = PageFactory.initElements(driver, cxpCreateCustomerPage.class);
		cxplitedataprovider = new cxplite_dataprovider();

	}

	@DataProvider
	public Object[][] getCreateCustomerData() {
		Object[][] data = cxplitedataprovider.getTestData("CreateCustomer");
		return data;

	}

	@Test(priority = 3, dataProvider = "getCreateCustomerData")
	public void validateCreateCustomer(String customerName, String customerType, String customerFirstName,
			String billTerms, String businessUnit, String referralType, String building, String street, String suite,
			String city, String state, String zip, String phone, String mobile, String email, String comments,
			String directions, String billContact, String accountingId, String contactAE, String contactFirstName,
			String contactLastName) throws Exception {
		Assert.assertTrue(createcustomerpage.createCustomer(customerName, customerType, customerFirstName, billTerms,
				businessUnit, referralType, building, street, suite, city, state, zip, phone, mobile, email, comments,
				directions, billContact, accountingId, contactAE, contactFirstName, contactLastName));
	}
}
