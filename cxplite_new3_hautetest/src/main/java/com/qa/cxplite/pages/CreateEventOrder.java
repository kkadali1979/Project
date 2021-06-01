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

public class CreateEventOrder {

	WebDriver driver;

	public CreateEventOrder(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CLASS_NAME, using = "dropbtnEventlst")
	public WebElement dhtml;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-home']")
	public WebElement homebutton;

	@FindBy(how = How.ID, using = "baseeventid")
	public WebElement editbox;

	@FindBy(how = How.XPATH, using = "//i[@class='glyphicon glyphicon-search']")
	public WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddEquipmentSubmit']")
	public WebElement btnaddequipmentsubmit;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddClose']")
	public WebElement btnaddclose;

	@FindBy(how = How.XPATH, using = "//button[@id='btnPkgFinalize']")
	public WebElement btnpkgfinalize;

	@FindBy(how = How.XPATH, using = "//button[@class='confirm btn btn-lg btn-primary']")
	public WebElement btnconfirm;

	@FindBy(how = How.XPATH, using = "//button[@id='btnBillServiceCancel']")
	public WebElement close_after_finalize_button;
	
	@FindBy(how = How.XPATH, using = "//*[@id='items']/a/div")
	public WebElement item;
	
	@FindBy(how = How.XPATH, using = "//*[@id='1']")
	public WebElement menu;
	
	

	// ***************************food

	@FindBy(how = How.XPATH, using = "//tr[@id='1']//label")
	public WebElement food_label_chkbox;

	@FindBy(how = How.XPATH, using = "//select[@id='AddMenuddlcourse_1']")
	public WebElement AddMenuddlcourse_food_items_selectbox;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddMenuSubmit']")
	public WebElement food_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddMenuCancel']")
	public WebElement food_Close_button;

	// ***************************alcohol
	@FindBy(how = How.XPATH, using = "//*[@id='0_145_0']/td[1]/div/label")
	public WebElement alcohol_label_chkbox;

	@FindBy(how = How.XPATH, using = "//tr[2]//td[1]//div[1]//label[1]//ancestor::td/parent::tr//child::td[3]/input")
	public WebElement alcohol_qty;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddAlcoholSubmit']")
	public WebElement alcohol_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddAlcoholCancel']")
	public WebElement alcohol_close_button;

	// ************non-alcoholic-beverages

	@FindBy(how = How.XPATH, using = "//*[@id='0_2_0.3']/td[1]/div/label")
	public WebElement non_Alcoholic_Beverages_label_chkbox;

	@FindBy(how = How.XPATH, using = "//input[@id='AddBeverageQty_13']")
	public WebElement non_Alcoholic_Beverages_qty;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddBeverageSubmit']")
	public WebElement non_Alcoholic_Beverages_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddBeverageCancel']")
	public WebElement non_Alcoholic_Beverages_close_button;

	// ***********************Rental Equipment

	// @FindBy(how = How.XPATH, using = "//tr[@id='0_1_9']//label")

	@FindBy(how = How.XPATH, using = "//tr[contains(@class,'loop even') or contains(@class,'loop odd')]//label")
	public List<WebElement> Rental_Equipment_label_chkbox;

	@FindBy(how = How.XPATH, using = "//input[@name='Addoutsideeqname_1']")
	public WebElement Rental_Equipment_qty;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddRentalSubmit']")
	public WebElement Rental_Equipment_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddRentalCancel']")
	public WebElement Rental_Equipment_close_button;

	// **************************Event_Equipment

	@FindBy(how = How.XPATH, using = "//tr[3]//td[1]//div[1]//label[1]")
	public WebElement Event_Equipment_label_chkbox;

	@FindBy(how = How.XPATH, using = "//input[@id='AddEquipmentQty_74']")
	public WebElement Event_Equipment_qty;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddEquipmentSubmit']")
	public WebElement Event_Equipment_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddEquipmentCancel']")
	public WebElement Event_Equipment_close_button;

	// **********************************Disposables

	@FindBy(how = How.XPATH, using = "//*[@id='0_126_0.07']/td[1]/div/label")
	public WebElement Disposables_label_chkbox;

	@FindBy(how = How.XPATH, using = "//input[@id='AddDisposableQty_1']")
	public WebElement Disposables_qty;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddDisposableSubmit']")
	public WebElement Disposables_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddDisposableCancel']")
	public WebElement Disposables_close_button;

	// **********************************staffing

	@FindBy(how = How.XPATH, using = "//select[@id='AddPersonnelddlStaffName_1']")
	public WebElement staffing_Name_select_dropdown;

	@FindBy(how = How.XPATH, using = "//input[@id='AddPersonnelQty_1']")
	public WebElement staffing_Qty;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddPersonnelSubmit']")
	public WebElement staffing_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddpersonnelCancel']")
	public WebElement staffing_close_button;

	// ******************************

	@FindBy(how = How.XPATH, using = "//div[@class='list-group']//a[contains(text(),'Food')]")
	public WebElement food;

	@FindBy(how = How.XPATH, using = "//div[@class='list-group']//a[contains(text(),'Alcohol')]")
	public WebElement alcohol;

	@FindBy(how = How.XPATH, using = "//*[@id='4']")
	public WebElement non_alcoholic_beverages;

	@FindBy(how = How.XPATH, using = "//div[@class='list-group']//a[contains(text(),'Rental Equipment')]")
	public WebElement rental_equipment;

	@FindBy(how = How.XPATH, using = "//*[@id='3']")
	public WebElement event_equipment;

	@FindBy(how = How.XPATH, using = "//*[@id='5']")
	public WebElement disposables;

	@FindBy(how = How.XPATH, using = "//*[@id='2']")
	public WebElement staffing;

	@FindBy(how = How.XPATH, using = "//span[@id='spOrderTotal']")
	public WebElement order_grandtotal;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-shopping-cart']")
	public WebElement event_order;
	// **************************collection tab****

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Collection')]")
	public WebElement collection_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='spnCollName_5']")
	public WebElement spncollpicon;

	@FindBy(how = How.XPATH, using = "//tr[contains(@id,'_1')]//label[starts-with(@for,'CollItem')]")
	public List<WebElement> collection_course_checkbox;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddMenuCollectionSubmit']")
	public WebElement collection_course_save_button;

	@FindBy(how = How.XPATH, using = "//button[@id='btnAddMenuCancel']")
	public WebElement collection_course_cancel_button;
	// ***********************package**************

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Package')]")
	public WebElement packagetab;

	@FindBy(how = How.XPATH, using = "//i[@class='glyphicon glyphicon-search']")
	public WebElement package_search;

	@FindBy(how = How.XPATH, using = "//table[@id='tblPackageslist']//tbody//tr[@class='even'or @class='odd']//a")
	public List<WebElement> package_menu_items;

	@FindBy(how = How.XPATH, using = "//tr[contains(@id,'loop')]/td/input[@type='text']")
	public List<WebElement> package_item_quantity;

	@FindBy(how = How.XPATH, using = "//button[@id='btnPackageSave']")
	public WebElement button_package_save;

	// *************************combo tab

	@FindBy(how = How.XPATH, using = "//a//div[@class='div-justified'][contains(text(),'Combo')]")
	public WebElement combo_tab;

	@FindBy(how = How.XPATH, using = "//i[@class='glyphicon glyphicon-search']")
	public WebElement combo_search_button;

	// table[@id='tblcombolist']//tr[starts-with(@class,'even') or
	// starts-with(@class,'odd')][1]

	@FindBy(how = How.XPATH, using = "//table[@id='tblcombolist']//tr[starts-with(@class,'even') or starts-with(@class,'odd')]/td/a")
	public List<WebElement> combo_list;

	@FindBy(how = How.XPATH, using = "//tr[@class='loop'][contains(@id,'loopPack')]/td[contains(@id,'tdItemQty')]/input")
	public List<WebElement> combo_quantity;

	@FindBy(how = How.XPATH, using = "//button[@id='btncombosave']")
	public WebElement combo_add_button;

	// ******************food********************
	public void add_food(String quantity) throws InterruptedException {

		try {
			driver.findElement(By.xpath("//*[@id='Basesearch']")).sendKeys("food");
//			new Actions(driver).moveToElement(food).click().build().perform();
			Thread.sleep(2000);
			new Actions(driver).moveToElement(searchButton).click().build().perform();
			Thread.sleep(2000);

			food_label_chkbox.click();
			new Select(AddMenuddlcourse_food_items_selectbox).selectByVisibleText("Buff");

			Thread.sleep(3000);
			driver.findElement(By.xpath("//table[@id='tbmenulist']/tbody//tr[@id='1']/td[5]/input")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//table[@id='tbmenulist']/tbody//tr[@id='1']/td[5]/input")).sendKeys(quantity);
			new Actions(driver).moveToElement(food_save_button).click().build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// *********************alcohol******************************

	public void add_alcohol(String quantity) throws InterruptedException {

		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", item);
			
			Thread.sleep(2000);
			new Actions(driver).moveToElement(alcohol).click().build().perform();
			Thread.sleep(4000);
			new Actions(driver).moveToElement(searchButton).click().build().perform();
			Thread.sleep(4000);
			alcohol_label_chkbox.click();
			Thread.sleep(2000);
//			driver.findElement(
//					By.xpath("//tr[2]//td[1]//div[1]//label[1]//ancestor::td/parent::tr//child::td[3]/input")).click();
			alcohol_qty.sendKeys(quantity);
			new Actions(driver).moveToElement(alcohol_save_button).click().build().perform();
			// addmenusubmitbutton.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ******************************non-alcoholic-beverages*********************************

	public void add_non_alcoholic_beverages(String quantity) throws InterruptedException {

		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", item);
			
			Thread.sleep(2000);
			new Actions(driver).moveToElement(non_alcoholic_beverages).click().build().perform();
			Thread.sleep(4000);
			new Actions(driver).moveToElement(searchButton).click().build().perform();
			Thread.sleep(4000);
			non_Alcoholic_Beverages_label_chkbox.click();
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//tr[2]//td[1]//div[1]//label[1]/parent::*/parent::*/following-sibling::td[2]/input"))
					.sendKeys(quantity);
			Thread.sleep(3000);
			new Actions(driver).moveToElement(non_Alcoholic_Beverages_save_button).click().build().perform();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ***********************rental_equipment
	public void add_rental_Equipment(String quantity) throws InterruptedException {

		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", item);
			
			Thread.sleep(2000);
			new Actions(driver).moveToElement(rental_equipment).click().build().perform();
			Thread.sleep(4000);
			new Actions(driver).moveToElement(searchButton).click().build().perform();
			Thread.sleep(4000);
			// Rental_Equipment_label_chkbox.click();

			Rental_Equipment_label_chkbox.get(0).click();

			Thread.sleep(1000);
			Rental_Equipment_qty.sendKeys(quantity);
			Thread.sleep(3000);
			new Actions(driver).moveToElement(Rental_Equipment_save_button).click().build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ********************Event_Equipment()************
	public void add_Event_Equipment(String quantity) throws InterruptedException {

		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", item);
			
			Thread.sleep(2000);
			new Actions(driver).moveToElement(event_equipment).click().build().perform();
			Thread.sleep(4000);
			new Actions(driver).moveToElement(searchButton).click().build().perform();
			Thread.sleep(4000);
			Event_Equipment_label_chkbox.click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//tr[3]//td[1]//div[1]//label[1]//ancestor::tr//td[3]//input"))
					.sendKeys(quantity);
			Thread.sleep(3000);
			new Actions(driver).moveToElement(Event_Equipment_save_button).click().build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ********************add_Disposables()************
	public void add_Disposables(String quantity) throws InterruptedException {

		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", item);
			
			Thread.sleep(2000);
			new Actions(driver).moveToElement(disposables).click().build().perform();
			Thread.sleep(4000);
			new Actions(driver).moveToElement(searchButton).click().build().perform();
			Thread.sleep(4000);
			Disposables_label_chkbox.click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//tr[2]//td[1]//div[1]//label[1]//ancestor::tr//td[3]//input"))
					.sendKeys(quantity);
			Thread.sleep(3000);
			new Actions(driver).moveToElement(Disposables_save_button).click().build().perform();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ********************add_Staffing()************
	public void add_Staffing(String quantity) throws InterruptedException {

		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", item);
			
			Thread.sleep(2000);
			new Actions(driver).moveToElement(staffing).click().build().perform();
			Thread.sleep(4000);

//			new Select(staffing_Name_select_dropdown).selectByVisibleText("Porter");
			 new Select(staffing_Name_select_dropdown).selectByIndex(1);

			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@id='AddPersonnelddlStaffName_1']//ancestor::tr//td[2]//input"))
					.sendKeys(quantity);
			Thread.sleep(3000);
			new Actions(driver).moveToElement(staffing_save_button).click().build().perform();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// *****************collection tab

	public void add_collection() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", menu);
			
		Thread.sleep(2000);
			new Actions(driver).moveToElement(collection_tab).click().build().perform();
			Thread.sleep(2000);
//			new Actions(driver).moveToElement(food).click().build().perform();
//			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(3000);
			spncollpicon.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//tr[contains(@id,'_1')][position()=2]//label")).click();
			Thread.sleep(4000);
			collection_course_save_button.click();
			Thread.sleep(4000);
			// ok or close in collections tab items label saved
			driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-success']")).click();
			Thread.sleep(3000);

			/*
			 * collection_course_cancel_button.click(); btnpkgfinalize.click();
			 */
			// driver.findElement(By.xpath("//button[@class='button btn
			// btn-warning service-btn-cancel pull-left']")).click();
//			Thread.sleep(8000);

			// close_after_finalize_button.click();
//			Thread.sleep(4000);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		// ******************package menu****************

	}

	public void add_package() {
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", menu);
			
			Thread.sleep(2000);
			new Actions(driver).moveToElement(packagetab).click().build().perform();
			Thread.sleep(2000);

//			new Actions(driver).moveToElement(food).click().build().perform();
//			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form//tr[2]//td[1]//a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='txtPkgItemQuantity_3121']")).sendKeys("2");
			Thread.sleep(1000);
			button_package_save.click();
			Thread.sleep(4000);
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void add_combo() throws InterruptedException {
		try {

			
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					combo_tab);*/
			Thread.sleep(2000);
			new Actions(driver).moveToElement(combo_tab).click().build().perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//form//tr[2]//td[1]//a[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='txtQuantity_1_821']")).sendKeys("2");
			combo_add_button.click();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(btnaddclose));
		new Actions(driver).moveToElement(btnaddclose).click().build().perform();

		Thread.sleep(4000);

		String beforefinalizetotal = driver.findElement(By.id("spOrderTotal")).getText();
		System.out.println("text that before clicking finalize button in Event order   : " + beforefinalizetotal);
	    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		WebElement finalize=driver.findElement(By.xpath("//*[@id='btnPkgFinalize']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", finalize);
		Thread.sleep(2000);			
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btnBillServiceCancel']")).click();
//		driver.findElement(By.xpath("//*[@class='confirm btn btn-lg btn-primary']")).click();
//		driver.findElement(By.xpath("//button[@id='btnInfoSave']")).click();
//		Thread.sleep(2000);
//		btnconfirm.click();

	}

}
