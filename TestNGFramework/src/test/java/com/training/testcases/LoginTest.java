package com.training.testcases;



import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;





/*
 * 
 * We are going to write the testcases
 * 
 */

public class LoginTest extends BaseTest {
	
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	String url;
	
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		
		driver = getDriver("firefox"); //Launch chromeBrowser
		url = getUrl(); // to get URL
		driver.get(url); //send URL to browser
		
		
		loginpage = new LoginPage(driver);	
		homepage = new HomePage(driver);
		DOMConfigurator.configure("log4j.xml");
		
		
	}
	
	
	
	@Test
	public void login() {
		
		/*
		 * Data can be taken from 
		 *  - Property file 
		 *  - Parameters from TestNG.xml
		 *  - get it from excel sheets
		 *  
		 * 
		 */
		
		
		Log.info("I'm logging in with my email");
		loginpage.enterintoEmail();
		loginpage.enterintoPassword();
		loginpage.clickLogin();
		Log.info("Clicked on Login");
		homepage.clickHomeTab();	
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("test1");
	}
	
	
	
	@AfterMethod
	public void teardown() {
		takeScreenShot(driver);
		driver.close();
	}
	

	
	
}
