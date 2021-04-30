package com.qa.cxplite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class cxpCreateCustomerPage {
	
	
	WebDriver driver;
	 public cxpCreateCustomerPage(WebDriver driver){ 
        this.driver=driver; 
}
	/************Home Icon Locator**************/
	@FindBy(how = How.ID, using = "a-Sales")
	public WebElement Homeicon;

	/************Right Menu Locator**************/
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus-circle']")
	public WebElement RightMenu;

	/************ Customer Locators **************/

	@FindBy(how = How.XPATH, using = "//a[contains(@href, '/Customer/Create')]")
	public WebElement CreateCustomerIcon;

	@FindBy(how = How.ID, using = "CUSTOMERNAME")
	public WebElement CustomerName;

	@FindBy(how = How.ID, using = "CUSTOMERTYPE_IDS")
	public WebElement CustomerType;
	
	@FindBy(how = How.XPATH, using = "//*[@id='FIRSTNAME' and @maxlength='100']")
	public WebElement CustomerFirstName;
	
	@FindBy(how = How.ID, using = "BILLTERMS_ID")
	public WebElement BillTerms;

	@FindBy(how = How.ID, using = "BUSINESSUNITS_IDS")
	public WebElement BusinessUnit;

	@FindBy(how = How.ID, using = "REFERRALTYPE_ID")
	public WebElement ReferralType;

	@FindBy(how = How.ID, using = "Next1")
	public WebElement FirstNext;

	/************ Same Customer Creation Locators **********/

	@FindBy(how = How.XPATH, using = "/html/body/div[5]")
	public WebElement SameCustomerNamePopup;

	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[7]/div/button")
	public WebElement SamecustomerNamePopupOkButton;

	/************ Address Locators **************/

	@FindBy(how = How.ID, using = "HOMEPHONE")
	public WebElement Phone;

	@FindBy(how = How.ID, using = "WORKPHONE")
	public WebElement Mobile;

	@FindBy(how = How.ID, using = "EMAIL")
	public WebElement Email;
	
	@FindBy(how = How.ID, using = "NAME")
	public WebElement Building;

	@FindBy(how = How.ID, using = "STREET")
	public WebElement Street;
	
	@FindBy(how = How.ID, using = "SUITE")
	public WebElement Suite;

	@FindBy(how = How.ID, using = "CITY")
	public WebElement City;

	@FindBy(how = How.ID, using = "STATE")
	public WebElement State;

	@FindBy(how = How.ID, using = "ZIP")
	public WebElement Zip;

	@FindBy(how = How.ID, using = "Next2")
	public WebElement SecondNext;

	@FindBy(how = How.ID, using = "Check_Add")
	public WebElement SameAsAddress;
	
	@FindBy(how = How.ID, using = "COMMENTS")
	public WebElement Comments;
	
	@FindBy(how = How.ID, using = "DIRECTIONS")
	public WebElement Directions;
	
	@FindBy(how = How.ID, using = "BILLCONTACTNAME")
	public WebElement BillContact;
	
	@FindBy(how = How.ID, using = "ACCOUNTINGID")
	public WebElement AccountingId;

	@FindBy(how = How.XPATH, using = "//button[@id='btnSubmit' and @tabindex='11']")
	public WebElement CreateButton_customer;

	/************ Contact Locators **************/

	@FindBy(how = How.ID, using = "AE_ID")
	public WebElement ContactAE;

	@FindBy(how = How.XPATH, using = "//*[@id='FIRSTNAME' and @maxlength='50']")
	public WebElement ConatactFirstName;

	@FindBy(how = How.ID, using = "LASTNAME")
	public WebElement ContactLastName;

	@FindBy(how = How.ID, using = "Next1")
	public WebElement NextButton;

	@FindBy(how = How.ID, using = "Check_Add")
	public WebElement SameAsCustomerAddress;

	@FindBy(how = How.XPATH, using = "//button[@id='btnSubmit' and @tabindex='16']")
	public WebElement CreateButton_conatct;

	@FindBy(how = How.XPATH, using = "//a[@class ='btn button  btn-warning']")
	public WebElement CloseButton;
	
	@FindBy(how = How.ID, using = "Contact")
	public WebElement EditContact;
	
	

	// Method to create Customer along with Contact
	public boolean createCustomer(String customerName, String customerType, String customerFirstName, String billTerms,
			String businessUnit, String referralType, String building, String street, String suite, String city,
			String state, String zip, String phone, String mobile, String email, String comments, String directions,
			String billContact, String accountingId, String contactAE, String contactFirstName, String contactLastName)
			throws Exception {
		boolean result = false;
		try {
			
			RightMenu.click();
			Thread.sleep(2000);
			CreateCustomerIcon.click();
			Thread.sleep(2000);
			
			CustomerName.sendKeys(customerName);
			new Select(CustomerType).selectByVisibleText(customerType);
			new Select(BillTerms).selectByVisibleText(billTerms);
			new Select(BusinessUnit).selectByVisibleText(businessUnit);
			new Select(ReferralType).selectByVisibleText(referralType);
			FirstNext.click();
			Building.sendKeys(building);
			Street.sendKeys(street);
			Suite.sendKeys(suite);
			City.sendKeys(city);
			new Select(State).selectByVisibleText(state);
			Zip.sendKeys(zip);
			Phone.sendKeys(phone);
			Mobile.sendKeys(mobile);
			Email.sendKeys(email);
			Comments.sendKeys(comments);
			Directions.sendKeys(directions);
			SecondNext.click();
			SameAsAddress.click();
			//test purpose wait
			Thread.sleep(5000);
			BillContact.sendKeys(billContact);
			AccountingId.sendKeys(accountingId);
			CreateButton_customer.click();
			Thread.sleep(7000);

			new Select(ContactAE).selectByVisibleText(contactAE);
			
			ConatactFirstName.sendKeys(contactFirstName);
			ContactLastName.sendKeys(contactLastName);
			NextButton.click();
			SameAsCustomerAddress.click();
			CreateButton_conatct.click();
			Thread.sleep(2000);
		
			Thread.sleep(5000);
			result = EditContact.isDisplayed();
		
			CloseButton.click();
			Homeicon.click();
			

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;

	}
}
