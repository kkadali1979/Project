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



public class CreateEstimatesPage {
	WebDriver driver;



	public CreateEstimatesPage(WebDriver driver) {
		this.driver=driver;
	}


	/************* dhtml *************/


	@FindBy(how = How.XPATH, using = "//*[@class='dropdownevntlst']")
	public WebElement eventDhtml;

	@FindBy(how = How.XPATH, using = "//a[@title='Estimates']")
	public WebElement ClickEstimates;

	@FindBy(how = How.XPATH, using = "//tr[@class='loop odd' or @class = 'loop even']")
	public List<WebElement> services; 


	//*******************************under test creditcard


	@FindBy(how=How.XPATH, using = "//select[@id='CreditcardtypeId']")
	public WebElement credit_card_type;	

	@FindBy(how=How.XPATH, using = "//input[@id='txtcreditfeetotal']")
	public WebElement credit_card_fee_amount;


	@FindBy(how=How.XPATH, using = "//input[@id='txtCreditcardfee']")
	public WebElement credit_card_fee;

	//***************************************

	//**************
	@FindBy(how=How.XPATH, using = "//button[@id='float-pmenubtn']//span")
	public WebElement float_menu_button;



	@FindBy(how=How.XPATH, using = "//em[@class='fa fa-expand']")
	public WebElement additional_fees_button;


	@FindBy(how=How.XPATH, using = "//em[@class='fas fa-exchange-alt fa-rotate-90']")
	public WebElement event_thirdparty_payee_button;
	//****************

	@FindBy(how=How.XPATH, using = "//select[@id='ddlAddlFeeType']")
	public WebElement additionalfeetype_select;


	@FindBy(how=How.XPATH, using = "//div[@class='col-lg-12 col-md-12 col-sm-12']//div//button[@id='btnTaskAdd']")
	public WebElement additionalfeetype_go_button;	


	//*********************************************************

	@FindBy(how=How.XPATH, using = "//td[@title='Proposed Revenue Total']/b")
	public WebElement proposedRevenueTotal;	

	@FindBy(how = How.ID, using = "btnEstmateLiteSubmit")
	public WebElement saveEstimates;

	@FindBy(how = How.XPATH, using = "//*[@id='btnEstimateLiteCancel']")
	public WebElement closeEstimates;

	@FindBy(how = How.XPATH, using = "//*[@id='float-pmenubtn']/span/i")
	public WebElement downArrow;

	@FindBy(how = How.XPATH, using = "//*[@id='btnAdditionfee']/em")
	public WebElement AdditionalFee;

	@FindBy(how = How.XPATH, using = "//*[@id='btnThirdPartyPayee']/em")
	public WebElement EventThirdParty;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnAdd']")
	public WebElement EventThirdParty_Add;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnTaskAdd']/i")
	public WebElement EventThirdParty_Search;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnTPPayeeSave']")
	public WebElement EventThirdParty_Save;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnCancel']")
	public WebElement EventThirdParty_Close;
	

	public boolean createEstimates(String combo,String food, String alcohol, String non_alcoholic_beverages, String rental_equipment, String event_equipment,
			String disposables,String staffing) {
		boolean result = false;
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Actions action = new Actions(driver);
			action.moveToElement(eventDhtml).build().perform();
			ClickEstimates.click();
			Thread.sleep(2000);
			//			for (int i = 1; i <= services.size(); i++) {
			//				String seriveId = driver
			//						.findElement(By.xpath("//tr[@class='loop odd' or @class = 'loop even'][" + i + "]"))
			//						.getAttribute("id");
			//				if (seriveId.equalsIgnoreCase("27")) 
			//				{
			//					wait.until(ExpectedConditions.elementToBeClickable(	By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]")));
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]")).click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]")).clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]")).sendKeys(combo);
			//				}
			//				else if (seriveId.equalsIgnoreCase("1")) 
			//				{
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.sendKeys(food);
			//				} 
			//				else if (seriveId.equalsIgnoreCase("25")) 
			//				{
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.sendKeys(alcohol);
			//				}
			//				else if (seriveId.equalsIgnoreCase("4"))
			//				{
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.sendKeys(non_alcoholic_beverages);
			//				}
			//				else if (seriveId.equalsIgnoreCase("12")) 
			//				{
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.sendKeys(rental_equipment);
			//				}
			//				else if (seriveId.equalsIgnoreCase("3"))
			//				{
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.sendKeys(event_equipment);
			//				}
			//				
			//				
			//				else if (seriveId.equalsIgnoreCase("5"))
			//				{
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.sendKeys(disposables);
			//				}
			//				
			//				else if (seriveId.equalsIgnoreCase("2"))
			//				{
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.click();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.clear();
			//					driver.findElement(By.xpath("//*[@id='tblEstimatelite']/tbody/tr[" + i + "]/td[4]/input[1]"))
			//							.sendKeys(staffing);
			//					
			//				}
			//			}
			//			
			//			
			//			
			driver.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']//label")).click();
			Thread.sleep(2000);
			saveEstimates.click();
			Thread.sleep(2000);
			String ProposedRevenueTotal = proposedRevenueTotal.getText();
			System.out.println(" propsed revenue Total    :   "+ProposedRevenueTotal);
			Thread.sleep(3000);
			action.moveToElement(downArrow).build().perform();
			Thread.sleep(2000);
			AdditionalFee.click();
			Thread.sleep(2000);

			WebElement checkbox=driver.findElement(By.xpath("/html//table[@id='tblAdditinalFee']/tbody/tr[@role='row']//label"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", checkbox);

//			driver.findElement(By.xpath("/html//div[@id='tblAdditinalFee_wrapper']//div[@class='dataTables_scrollHead']//table[@role='grid']//tr[@role='row']/th[1]//label")).click();
//			driver.findElement(By.xpath("//*[@id='btnAddlFeeSubmit']")).click();
			Thread.sleep(2000);
			executor.executeScript("document.getElementById('btnAddlFeeSubmit').click()");
			Thread.sleep(2000);
			action.moveToElement(downArrow).build().perform();
			Thread.sleep(2000);
			event_thirdparty_payee_button.click();
			Thread.sleep(2000);
			EventThirdParty_Add.click();
			Thread.sleep(2000);
			
			WebElement dropDown= driver.findElement(By.xpath("//*[@id='PayeeId']"));
			Select SelectDropDown= new Select(dropDown);
			SelectDropDown.selectByVisibleText("Planner Sample 1");
			Thread.sleep(2000);
			EventThirdParty_Search.click();
			Thread.sleep(2000);
			EventThirdParty_Save.click();
			Thread.sleep(2000);
			executor.executeScript("arguments[0].click();", EventThirdParty_Close);
			Thread.sleep(2000);
			executor.executeScript("document.getElementById('btnEstimateLiteCancel').click()");
			
//			wait.until(ExpectedConditions.elementToBeClickable(closeEstimates));
//			closeEstimates.click();
			Thread.sleep(3000);

			if (!ProposedRevenueTotal.equalsIgnoreCase("0.00"))
				result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
