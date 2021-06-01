package com.qa.cxplite.pages;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Even;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cxplite.dataproviders.cxplite_dataprovider;

public class Create_billservice {

	cxplite_dataprovider cxplitedataprovider;
	WebDriver driver;
	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\cxplite\\testdata1\\cxpdatadata.xls";
	static Workbook book;
	static Sheet sheet;
	FileInputStream file;
	

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

	@FindBy(how=How.XPATH,using="//*[@id='a-Scheduling']/span/i")
	WebElement Knife_Fork_Button;

	@FindBy(how=How.XPATH,using="//*[@id=\"browse\"]/tbody/tr[1]/td/a")
	WebElement Accountling_Link;  //*[@id="browse"]/tbody/tr[1]

	@FindBy(how=How.XPATH,using="//*[@id='screenlinks']/div[1]/a")
	WebElement Filter_Link;

	@FindBy(how=How.XPATH,using="//*[@id='eventList']/table[2]/tbody/tr[3]/td[1]/a/img")
	WebElement DHTML_Link;

	@FindBy(how=How.XPATH,using="//*[@id='popmenu']/div[7]/a")
	WebElement Event_Vendor_Bills;

	@FindBy(how=How.XPATH,using="//*[@id='dijit_form_Button_0_label']")
	WebElement Ready_Button;

	@FindBy(how=How.XPATH,using="//*[@title='Home']")
	WebElement Home_Icon;

	@FindBy(how=How.XPATH,using="//*[@id='browse']/tbody/tr[9]/td/a")
	WebElement CaterXpert_Lite_Link;

	@FindBy(how=How.XPATH,using="//*[@id='btnManiSearch']")
	WebElement Search_Button;



	public void makebill()
	{
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
			book = WorkbookFactory.create(file);
			sheet = book.getSheet("EventNumber");
			String eventNumber=sheet.getRow(1).getCell(0).toString();
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", billservicetab);
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

			if(finalizebutton.isEnabled()==true)
			{
				finalizebutton.click();

				Thread.sleep(4000);

				System.out.println("After clicking finalize button grand total    :    "+grandtotal.getText());
				Thread.sleep(2000);
				cancelbutton.click();
			}
			else 
			{
				cancelbutton.click();
				Knife_Fork_Button.click();
				Thread.sleep(2000);
				driver.switchTo().frame("right");
				Accountling_Link.click();

				driver.switchTo().frame("header");
				Filter_Link.click();
				
			// Store the current window handle
				String winHandleBefore = driver.getWindowHandle();

			// Switch to new window opened
				for(String winHandle : driver.getWindowHandles())
				{
					driver.switchTo().window(winHandle);
				}

				// Perform the actions on new window
				WebElement Event_id= driver.findElement(By.xpath("//*[@id='cisnumber']"));
				Event_id.clear();
//				System.out.println(eventNumber);
				Event_id.sendKeys(eventNumber);
				driver.findElement(By.xpath("//*[@id='apply_label']")).click();

				// Switch back to original browser (first window)
				driver.switchTo().window(winHandleBefore);

				// Continue with original browser (first window)
				driver.switchTo().frame("right");
				Actions action = new Actions(driver);
				action.moveToElement(DHTML_Link).build().perform();
				Event_Vendor_Bills.click();

				driver.switchTo().frame("right");
				Ready_Button.click();
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().frame("header");
				Home_Icon.click();
				Thread.sleep(2000);
				driver.switchTo().frame("right");
				CaterXpert_Lite_Link.click();
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//*[@id='baseeventid']")).sendKeys(eventNumber);
				Search_Button.click();

			}
			} 

			catch (Exception e) {
				e.printStackTrace();
			}
		}











	}
