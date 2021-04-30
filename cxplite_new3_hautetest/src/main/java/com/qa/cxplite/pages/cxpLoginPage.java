package com.qa.cxplite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class cxpLoginPage {
	WebDriver driver;
	 public cxpLoginPage(WebDriver driver){ 
         this.driver=driver; 
 }
/************** Login Locators**********/
@FindBy(how = How.NAME, using = "CatererID")
public WebElement Catererid;

@FindBy(how = How.NAME, using = "USERNAME")
public WebElement UserName;

@FindBy(how = How.ID, using = "txtpassword")
public WebElement Password;

@FindBy(how =  How.ID, using = "button1")
public WebElement Login;




public String login(String catererid, String username, String password) throws Exception {
	
	try {
		Catererid.clear();
		Catererid.sendKeys(catererid);
		UserName.clear();
		UserName.sendKeys(username);
		Password.clear();
		Password.sendKeys(password);
		Login.click();
		Thread.sleep(2000);
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	return driver.getTitle();
}
}
