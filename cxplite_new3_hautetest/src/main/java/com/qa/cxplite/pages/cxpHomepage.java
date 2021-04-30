package com.qa.cxplite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class cxpHomepage {
	WebDriver driver;
	
	 public cxpHomepage(WebDriver driver)
	 { 
        this.driver=driver; 
	 }
	 
	@FindBy(how=How.XPATH,using="//i[@class='fa fa-home']")
	public WebElement Homeicon;

	public  String validatehomepage() throws InterruptedException
	{
		
		Homeicon.click();
		Thread.sleep(3000);
		return driver.getTitle();
	}
}
