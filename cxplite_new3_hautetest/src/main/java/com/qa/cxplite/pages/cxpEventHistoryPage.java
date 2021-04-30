package com.qa.cxplite.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class cxpEventHistoryPage {
	WebDriver driver;
	

	public cxpEventHistoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-home']")
	public WebElement homebutton;

	@FindBy(how = How.ID, using = "baseeventid")
	public WebElement editbox;

	@FindBy(how = How.XPATH, using = "//i[@class='glyphicon glyphicon-search']")
	public WebElement searchButton;

	@FindBy(how = How.CLASS_NAME, using = "dropbtnEventlst")
	public WebElement dhtml;

	@FindBy(how = How.XPATH, using = "//em[@class='fas fa-archive']")
	public WebElement Eventhistory;

	@FindBy(how = How.XPATH, using = "//table[@id='Eventhistory']//tr[@class='odd' or @class='even']")
	public List<WebElement> Eventhistory_rows;
	
	@FindBy(how = How.XPATH, using = "//table[@id='Eventhistory']//tr[@class='odd' or @class='even']//td")
	public List<WebElement> cell;
	
	
	@FindBy(how=How.TAG_NAME, using = "mark")
	public List<WebElement> markup;
	
	public void eventhistorytable() throws InterruptedException {
		
		try {
			
			for (int i = 0; i <Eventhistory_rows.size(); i++) {
				List<WebElement> cols_row = Eventhistory_rows.get(i).findElements(By.tagName("td"));

				for (int j = 1; j < cols_row.size(); j++) {

					System.out.print(cols_row.get(j).getText());

				}
				System.out.println();
			}
		
			
			for(int k=0;k<markup.size();k++)
			{
				System.out.println("modified or edited events are    :"+markup.get(k).getText());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	}
	

