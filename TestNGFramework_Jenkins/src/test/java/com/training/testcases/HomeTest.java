package com.training.testcases;

import java.io.IOException;

/*
 * 
 * Test and Data
 */

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;

public class HomeTest extends BaseTest{
	
	
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	String url;
	
	
	@BeforeMethod
	@Parameters({"chrome"})
	public void beforeMethod(String chrome) throws IOException {
		driver = getDriver(chrome); //Launch chromeBrowser
		//driver = getDriver("chrome"); //Launch chromeBrowser
		url = getUrl(); // to get URL
		driver.get(url); //send URL to browser
		
		
		loginpage = new LoginPage(driver);	
		homepage = new HomePage(driver);
		
		
	}
	
	@Test
	public void enterfirstname() {
		
		loginpage.enterintoEmail();
		loginpage.enterintoPassword();
		loginpage.clickLogin();
		homepage.clickHomeTab();
		
		homepage.enterintofirstname();
		
	}
	
	@Test
	public void enterfathername() {
		loginpage.enterintoEmail();
		loginpage.enterintoPassword();
		loginpage.clickLogin();
		homepage.clickHomeTab();
		
		homepage.enterintofirstname();
		homepage.enterintofathername();
		
	}
	@Test
	public void enterpostaladdress() {
		loginpage.enterintoEmail();
		loginpage.enterintoPassword();
		loginpage.clickLogin();
		homepage.clickHomeTab();
		
		homepage.enterintofirstname();
		homepage.enterintofathername();
		homepage.enterintopostalAddress();
	}
	

}
