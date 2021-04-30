package com.qa.cxplite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Create_billservice {
	
	WebDriver driver;

	public Create_billservice(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how=How.XPATH,using="//a[contains(@href,'BillService')]")
	WebElement billservicetab;	
	
	@FindBy(how=How.XPATH,using="//label[@id='Grnadtotal']")
	WebElement grandtotal;
		

	@FindBy(how=How.XPATH,using="//i[@class='fa fa-cogs']")
	WebElement generatebillbutton;
	
	
	@FindBy(how=How.XPATH,using="//i[@class='fa fa-clone']")
	WebElement recreatebillbutton;
	
	
	@FindBy(how=How.XPATH,using="//button[@id='btnSave']")
	WebElement savebutton;	
	
	
	@FindBy(how=How.XPATH,using="//button[@id='btnSave']")
	WebElement addbutton;	
	
	
	@FindBy(how=How.XPATH,using="//button[@id='btnBillServiceCancel']")
	WebElement cancelbutton;
		
	
	@FindBy(how=How.XPATH,using="//i[@class='fas fa-utensils']")
	WebElement nav_baseapplicationtab_spoon;
	
	
	
	@FindBy(how=How.XPATH,using="//button[@id='btnFinalize']")
	WebElement finalizebutton;
	
	
	
	
	
	
	
	
	public void makebill()
	{
		try {
			billservicetab.click();
			Thread.sleep(2000);
			generatebillbutton.click();
			Thread.sleep(2000);
			System.out.println(" Grand Total   :   "+grandtotal.getText());
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", finalizebutton);
		
		
			/*nav_baseapplicationtab_spoon.click();
			Thread.sleep(2000);
		
			driver.switchTo().frame("right");
			driver.findElement(By.xpath("//a[contains(text(),'Accounting')]")).click();
			*/
			
			finalizebutton.click();
			
			Thread.sleep(4000);
			
			System.out.println("After clicking finalize button grand total    :    "+grandtotal.getText());
			Thread.sleep(2000);
			cancelbutton.click();
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
