package com.qa.cxplite.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cxplite_changerequest {

	WebDriver driver;

	public cxplite_changerequest(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-home']")
	public WebElement homebutton;

	@FindBy(how = How.ID, using = "baseeventid")
	public WebElement editbox;

	@FindBy(how = How.XPATH, using = "//i[@class='glyphicon glyphicon-search']")
	public WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//table[@id='example']//tbody//tr[2]//td")
	public List<WebElement> Eventlisting_items_table_cr;

	@FindBy(how = How.XPATH, using = "//a[contains(@onclick,'ChangeRequest') and @class='label a-event-status label-info']")
	public WebElement changerequestbutton;

	@FindBy(how = How.XPATH, using = "//a[contains(@class,'pull-right')]")
	public WebElement changerequest_addbutton;

	@FindBy(how = How.NAME, using = "ServiceId")
	public WebElement service_dropdown;

	@FindBy(how = How.XPATH, using = "//textarea[@id='txtComments']")
	public WebElement comments;

	@FindBy(how = How.XPATH, using = "//button[@id='btnchangeAdd']")
	
	public WebElement cr_add_items;

	@FindBy(how = How.XPATH, using = "//button[@id='btnchangecancel']")
	public WebElement cr_closebutton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'row')]//a[@id='btnchangereqclose']")
	public WebElement after_cr_closebutton;

	@FindBy(how = How.XPATH, using = "//div[@id='tblChangeRequestCurrItemslist_wrapper']//div[@class='slimScrollDiv']")
	public WebElement current_menu__items;
	// *****************
	@FindBy(how = How.XPATH, using = "//table[contains(@id,'tblChangeReq')]//tbody//tr//td")
	public WebElement currentmenu_table;
	@FindBy(how = How.XPATH, using = "//table[@id='tblChangeRequestCurrItemslist']// tbody//tr[@class='loop odd' or @class='loop even']/td[5]/input[@type='text']")
	public List<WebElement> currentmenu_quantity;

	@FindBy(how = How.XPATH, using = "//table[@id='tblChangeRequestCurrItemslist']// tbody//tr[@class='loop odd' or @class='loop even']/td[9]/select[contains(@id,'AddOrDeduct')]")
	public WebElement currentmenu_add_or_deduct;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Save')]")
	public WebElement currentmenu_savebutton;

	@FindBy(how = How.XPATH, using = "//div[@class='row']//a[@id='btnchangereqclose']")
	public WebElement currentmenu_closebutton;

	@FindBy(how = How.ID, using = "btnSend")
	public WebElement changerequest_send_button;
	
	

	public void cr_changerequest(String quantity, String addordeduct) throws InterruptedException {

		for (int i = 1; i <= Eventlisting_items_table_cr.size(); i++) {
			String status = Eventlisting_items_table_cr.get(i).getText();
			if (status.equalsIgnoreCase("Sent")) {
				changerequestbutton.click();
				Thread.sleep(4000);
				break;
			}
		}
new Actions(driver).moveToElement(changerequest_addbutton).click().build().perform();
		//changerequest_addbutton.click();
		Thread.sleep(2000);
		// new Select(service_dropdown).selectByVisibleText("");
		Select service=new Select(service_dropdown);
	List<WebElement> ser = service.getOptions();
	
	for(int i=1;i<ser.size();i++)
	{
		String servicename = ser.get(i).getText();
		if(!servicename.equals("Food"))
		{
			ser.get(i).click();
			break;
		}
	}
	
			
	
	
		
		
		
		comments.sendKeys("enter the comments");
		cr_add_items.click();

		Thread.sleep(3000);

		new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf(currentmenu_table));
		//System.out.println("current menu    quantity  of chan  :" + currentmenu_quantity.size());
		
			try {
				
				WebElement quantity_element = driver	.findElement(By.xpath("//table[contains(@id,'tblChangeReq')]//tbody//tr//td[4]//input[@type='text']"));

				quantity_element.clear();
				
				quantity_element.sendKeys(quantity);
				
				WebElement ADDorDeduct = driver.findElement(By.xpath("//table[contains(@id,'tblChangeReq')]//tbody//tr//td[6]//select[contains(@id,'AddOrDeduct')]"));
				
				new Select(ADDorDeduct).selectByVisibleText(addordeduct);
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		
		currentmenu_savebutton.click();
		Thread.sleep(3000);
		
		
		
		new Actions(driver).moveToElement(after_cr_closebutton).click().build().perform();
		
		// after_cr_closebutton.click();
		
		
		
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='btnSend']")).click(); 		 
		 
		 
		 
		 
		
		
		
	
		Thread.sleep(2000);
		cr_closebutton.click();
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.xpath("//div[@id='divChangeManagement']//form//div//div//div//a[@id='btnchangereqclose']")).click();
		Thread.sleep(2000);
	}

}
