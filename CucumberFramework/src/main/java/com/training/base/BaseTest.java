package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	static CommonUtilities commonUtilities = new CommonUtilities();
	static String url;
	
	public static void launchApplication() throws IOException {
		
		
		driver = getDriver();
		url = commonUtilities.getproperty("url");
		driver.get(url);
		
	}
	
	public static WebDriver getDriver() {
		
		if(driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		return driver;
	}

}
