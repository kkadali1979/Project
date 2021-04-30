package com.qa.cxplite.utils;

import java.util.Calendar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.cxplite.utils.TestBase1;
public class DatePicker extends TestBase1 {
	DatePickerLocators datePickerLocators;

	public DatePicker() {
		datePickerLocators = PageFactory.initElements(driver, DatePickerLocators.class);
	}

	public void pickDate(String date) throws Exception {
		String date_dd_MM_yyyy[] = (date.split(" ")[0]).split("/");
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		datePickerLocators.year.click();

		// To select Year
		if (yearDiff != 0) {
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {
					datePickerLocators.nextYear.click();
				}

			} else if (yearDiff < 0) {
				for (int i = 0; i > (yearDiff); i--) {
					datePickerLocators.previousYear.click();
				}
			}
		}

		// To select Month
		datePickerLocators.months.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();

		// To select Date
		for (WebElement cell : datePickerLocators.days) {
			if (cell.getText().equals((date_dd_MM_yyyy[1]))) {
				cell.click();
				break;
			}
		}
	}
}
