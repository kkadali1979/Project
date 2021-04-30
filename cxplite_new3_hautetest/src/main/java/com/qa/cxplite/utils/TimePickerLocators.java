package com.qa.cxplite.utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TimePickerLocators {

	@FindBy(how = How.XPATH, using = "//div[@class='clockpicker-dial clockpicker-hours']/div[@class='clockpicker-tick']")
	public List<WebElement> hours;
	
	@FindBy(how = How.XPATH, using = "//div[@class='clockpicker-dial clockpicker-minutes']/div[@class='clockpicker-tick']")
	public List<WebElement> minutes;
	
	@FindBy(how = How.XPATH, using = "//span[@class='clockpicker-am-pm-block']/button")
	public List<WebElement> ampm;
	
	@FindBy(how = How.XPATH, using = "//button[text()='AM']")
	public WebElement am;
	
	@FindBy(how = How.XPATH, using = "//button[text()='PM']")
	public WebElement pm;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Done']")
	public WebElement done;
}
