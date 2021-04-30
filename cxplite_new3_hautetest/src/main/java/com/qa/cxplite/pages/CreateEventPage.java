package com.qa.cxplite.pages;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;

import com.qa.cxplite.utils.DatePicker;
import com.qa.cxplite.utils.TimePicker;

import io.appium.java_client.android.nativekey.KeyEvent;

public class CreateEventPage   {
	DatePicker datePicker;
	TimePicker timePicker;
	 cxplite_dataprovider cxpLiteDataProvider;
	int count = 0;

	WebDriver driver;

	public CreateEventPage(WebDriver driver) {
		this.driver = driver;
		datePicker = new DatePicker();
		timePicker = new TimePicker();
		cxpLiteDataProvider=new cxplite_dataprovider();

	}

	/************ Home Icon Locator **************/
	@FindBy(how = How.ID, using = "a-Sales")
	public WebElement Homeicon;

	/************ Right Menu Locator **************/
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus-circle']")
	public WebElement RightMenu;

	/********** Customer Search icon **************/

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-search']")
	public WebElement searchCustomerIcon;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'textbox-search')]")
	public WebElement customerSearch;

	@FindBy(how = How.XPATH, using = "//i[@class='glyphicon glyphicon-search']")
	public WebElement searchButton;

	/************ Event Locators **********/

	@FindBy(how = How.XPATH, using = "//div[@class='dropdownevntlst']")
	public WebElement customerdhtml;

	@FindBy(how = How.XPATH, using = "//a[@title='Create Event']")
	public WebElement customerCreateEventIcon;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/a[5]")
	public WebElement eventicon;

	@FindBy(how = How.XPATH, using = "//input[@id= 'txtCustomer']")
	public WebElement customername;

	@FindBy(how = How.XPATH, using = "*//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li[1]")
	public WebElement customernamelist;

	@FindBy(how = How.ID, using = "AE_ID")
	public WebElement ae;

	@FindBy(how = How.ID, using = "begindate")
	public WebElement beginDate;

	@FindBy(how = How.ID, using = "begintime")
	public WebElement beginTime;

	@FindBy(how = How.ID, using = "enddate")
	public WebElement endDate;

	@FindBy(how = How.ID, using = "endtime")
	public WebElement endTime;

	@FindBy(how = How.ID, using = "EVENTTYPE_ID")
	public WebElement eventType;

	@FindBy(how = How.ID, using = "PARTYSTATUS_ID")
	public WebElement eventStatus;

	@FindBy(how = How.ID, using = "EVENTNAME")
	public WebElement eventname;

	@FindBy(how = How.ID, using = "EVENTTHEME_ID")
	public WebElement eventTheme;

	@FindBy(how = How.ID, using = "BUSINESSUNITS_ID")
	public WebElement businessUnit;

	@FindBy(how = How.ID, using = "ddplattertype")
	public WebElement platterType;

	@FindBy(how = How.ID, using = "GUESTCOUNT")
	public WebElement guestCount;

	
	
	@FindBy(how = How.ID, using = "Next1")
	public WebElement firstNext;

	// ****************************

	@FindBy(how = How.ID, using = "COUNTY_ID")
	public WebElement county;

	@FindBy(how = How.ID, using = "LOCZIP")
	public WebElement zip;

	@FindBy(how = How.ID, using = "LOCCITY")
	public WebElement city;

	@FindBy(how = How.ID, using = "LOCSTREET")
	public WebElement street;

	@FindBy(how = How.XPATH, using = "//select[@id='STATE_ID']")
	public WebElement state;

	@FindBy(how = How.ID, using = "LOCPHONE")
	public WebElement phone;

	@FindBy(how = How.ID, using = "CONTACTHOMEPHONE")
	public WebElement homePhone;

	@FindBy(how = How.ID, using = "CONTACTEMAIL")
	public WebElement email;

	@FindBy(how = How.ID, using = "Next2")
	public WebElement secondnext;

	// ********************

	@FindBy(how = How.ID, using = "btnSubmit")
	public WebElement createEvent;

	@FindBy(how = How.XPATH, using = "//*[@id='myModalSummary']//div[2]/div[1]/div/div/div")
	public WebElement eventNuber;

	@FindBy(how = How.XPATH, using = "//*[@id='myModalSummary']//div[3]//div[1]/a")
	public WebElement eventListingButton;
	
	/*************Search Event*************/
	@FindBy(how = How.ID, using = "baseeventid")
	public WebElement eventSearch;
	
	@FindBy(how = How.ID, using = "btnManiSearch")
	public WebElement eventSearchButton;
	
	@FindBy(how=How.XPATH, using = "//table[@id='example']//tbody/tr[2]/td[2]")
	public WebElement eventNumberAfterSearch;

	public  boolean createEventFromCustomer(String customerName, String Ae, String BeginDate, String BeginTime,
			String EndDate, String EndTime, String EventType, String EventStatus, String EventName, String EventTheme,
			String BusinessUnit, String PlatterType, String GuestCount, String County, String Homephone, String Email)
			throws InterruptedException

	{
		boolean result = false;
		try {
			count++;
			Homeicon.click();
			RightMenu.click();
			searchCustomerIcon.click();
			customerSearch.clear();
			customerSearch.sendKeys(customerName);
			searchButton.click();
			Thread.sleep(4000);
			Actions a = new Actions(driver);
			a.moveToElement(customerdhtml).build().perform();
			customerCreateEventIcon.click();
			Thread.sleep(2000);
			new Select(ae).selectByVisibleText(Ae);
			Thread.sleep(3000);
			beginDate.click();
			Thread.sleep(3000);
			datePicker.pickDate(BeginDate);
			Thread.sleep(2000);
			beginTime.click();
			Thread.sleep(4000);
			
			timePicker.pickTime(BeginTime);
			
			
			//************************
			
			Thread.sleep(2000);
			endDate.click();
			Thread.sleep(1000);
			datePicker.pickDate(EndDate);
			Thread.sleep(1000);
			endTime.click();
			Thread.sleep(1000);
			
			timePicker.pickTime(EndTime);
			
			Thread.sleep(2000);
			new Select(eventType).selectByVisibleText(EventType);
			new Select(eventStatus).selectByVisibleText(EventStatus);
			eventname.sendKeys(EventName);

			// new
			// Select(createEventPageLocators.eventTheme).selectByVisibleText(eventTheme);
			new Select(businessUnit).selectByVisibleText(BusinessUnit);

			new Select(platterType).selectByVisibleText(PlatterType);

			guestCount.sendKeys(GuestCount);
			firstNext.click();

			new Select(county).selectByVisibleText(County);
			homePhone.sendKeys(Homephone);

			email.clear();
			email.sendKeys(Email);
Thread.sleep(2000);
			secondnext.click();
			Thread.sleep(2000);
			createEvent.click();
			Thread.sleep(2000);
			String eventDetails = eventNuber.getText();

			result = eventNuber.isDisplayed();
			String[] eventNumber = eventDetails.split(" ");
			
			System.out.println("Created Event Number is: " + eventNumber[1]);
			
			Thread.sleep(2000);
			eventListingButton.click();
			cxpLiteDataProvider.setDataEventNumber("EventNumber", count, 0, eventNumber[1]);

		

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	// To search an Event from Event Listing screen
		public boolean searchEvent(String eventNumber) throws Exception {
			boolean result = false;
			try {
				Thread.sleep(2000);
				eventSearch.clear();
				Thread.sleep(2000);
				eventSearch.sendKeys(eventNumber);
				Thread.sleep(2000);
				eventSearchButton.click();
				Thread.sleep(2000);
				String EventNumberAfterSearch = eventNumberAfterSearch.getText();
				if (EventNumberAfterSearch.equals(eventNumber))
					result = true;

			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
		}
}
