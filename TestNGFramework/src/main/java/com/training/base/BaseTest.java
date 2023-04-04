package com.training.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	CommonUtilities common = new CommonUtilities();
	
	public WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")) {	
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

	
	public String getUrl() throws IOException {
		String sUrl = common.getProperty("url");
		return sUrl;
	}
	
	public void takeScreenShot(WebDriver driver) {
	
		//Take screen interface is used to take screenshot by passing the driver
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
	
		//we need convert screenshot object convert into file so we convert it into source file but we don't know where it will store
		//It will be in the memory to bring it into physical file we need another destination file
		
		File srcFile =  screenshot.getScreenshotAs(OutputType.FILE);
		
		Date currentDate = new Date();
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(currentDate);
		
		
		String filePath = "/Users/rahade/eclipse-workspace/TestNGFramework/Screenshots/SalesforceScreenshot"+timeStamp+".jpeg";
		
		//I'll create destination file to store screenshot object
		File desFile = new File(filePath);
		
		//Then using file utilties copy file ... convert the file object to a physical file
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
