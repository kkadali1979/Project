package com.qa.cxplite.utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePickerLocators {
	
	@FindBy(how = How.CLASS_NAME, using ="datepicker-switch")
	public WebElement year;
	
	@FindBy(how = How.CLASS_NAME, using = "prev")
	public WebElement previousYear;
	
	@FindBy(how = How.CLASS_NAME, using = "next")
	public WebElement nextYear;
	
	@FindBy(how = How.CLASS_NAME, using = "month")
	public List<WebElement> months;

	@FindBy(how = How.XPATH, using = "//td[@class='day' or @class='active day']")
	public List<WebElement> days;
}
