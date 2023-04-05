package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	/*
	 * The protected keyword is an access modifier used for attributes, 
	 * methods and constructors, making them accessible in the same package and subclasses.
	 */
	

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		//Page factory Initialization
		//To initialize all the elements in the page 
		PageFactory.initElements(driver, this); //Page Factory Initialization
		
		
	}
	
	public void waitforVisibility(WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
