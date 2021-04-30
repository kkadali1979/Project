package com.qa.cxplite.utils;

import java.io.FileInputStream;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase1 {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase1() {
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/main/java/com/qa/cxplite/configproperties/config.properties");
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
@BeforeTest

@Parameters({"browserName"})
	public void initialization(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
			
				
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
//				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
