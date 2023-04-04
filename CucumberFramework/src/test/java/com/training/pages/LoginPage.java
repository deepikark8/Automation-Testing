package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	
	 static WebDriver driver;
	
	public LoginPage() {
		
		super(driver = BaseTest.getDriver());
		
		addObject("Username",By.id("email_field"));
		addObject("Password",By.id("password_field"));
		addObject("Login",By.xpath("//button[@onclick='login()']"));
		addObject("Heading",By.xpath("//h3[normalize-space()='Web login']"));
		
	}
}
