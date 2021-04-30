package com.qa.cxplite.dataproviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.lang3.SystemUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.InvalidArgumentException;

public class cxplite_dataprovider {
	//public static String TESTDATA_SHEET_PATH = "D:/cxpdatadata.xls";
	                                                    
	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\cxplite\\testdata1\\cxpdatadata.xls";
	static Workbook book;
	static Sheet sheet;

	public cxplite_dataprovider() {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Object[][] getTestData(String sheetName) 
	{

		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
				for (int i = 0; i < sheet.getLastRowNum(); i++)
				{
			    for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) 
			    {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();			
			    }
		         }
		return data;
	}

	public void setDataEventNumber(String sheetName, int row, int column, String eventNumber) throws IOException {
		try {
			
			book.getSheet(sheetName).createRow(row).createCell(column).setCellValue(eventNumber);
			FileOutputStream fout = new FileOutputStream(TESTDATA_SHEET_PATH);
			book.write(fout);
			fout.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
 