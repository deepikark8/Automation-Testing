package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.training.base.BasePage;

/*
 * 
 * I will store my elements and its actions
 * 
 * Every page need a driver... When we need to pass any information to parent class we use the keyword super.
 * 
 * 
 */

public class LoginPage extends BasePage{
	
	@FindBy(id="email_field")
	WebElement email;
	
	@FindBy(id="password_field")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		//When we need to pass any information to parent class we use the keyword super.
		//Parent class is BasePage
		 super(driver);
		
	}
	
	
	public void enterintoEmail() {
		email.sendKeys("admin123@gmail.com");
	}
	
	public void enterintoPassword() {
		password.sendKeys("admin123");
	}
	
	public void clickLogin() {
		waitforVisibility(loginButton,10);
		loginButton.click();
	}
	
	
	
}
