package com.qa.cxplite.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TimePicker extends TestBase1 {

	TimePickerLocators timePickerLocators;

	public TimePicker() {
		timePickerLocators = PageFactory.initElements(driver, TimePickerLocators.class);
	}

	public void pickTime(String time) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			String time_HR_MI[] = (time.split(" ")[0]).split(":");
			
			int hours = Integer.parseInt(time_HR_MI[0]);
			for (WebElement cell : timePickerLocators.hours) {
				int hours_application = Integer.parseInt(cell.getText());
				if (hours_application == hours) {
					cell.click();
					Thread.sleep(2000);
					for (WebElement cell1 : timePickerLocators.minutes) { 
						if (cell1.getText().equals((time_HR_MI[1]))) {
							
							Thread.sleep(2000);
							cell1.click();
							Thread.sleep(2000);

							for (WebElement cell2 : timePickerLocators.ampm) {

								if (time.split(" ")[1].equalsIgnoreCase(cell2.getText())) {

									wait.until(ExpectedConditions.elementToBeClickable(cell2));
									cell2.click();
									Thread.sleep(2000);
									try {
										timePickerLocators.done.click();
										Thread.sleep(2000);
									} catch (Exception e) {
										driver.findElement(By.xpath("/html/body/div[8]/button")).click();
									}
									break;
								}
							}
							break;
						}

					}
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
