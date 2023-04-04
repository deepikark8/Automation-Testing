package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
 	WebDriver driver;
	
	public HashMap<String,By> ObjectRepo = new HashMap<String,By>();
	
	//Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addObject(String LogicalName,By by) {
		ObjectRepo.put(LogicalName, by);
	}
	
	private WebElement getElement(String LogicalName) {
		System.out.println(" LogicalName :"+ LogicalName);
		By by = ObjectRepo.get(LogicalName);
		//driver.findElement(By.id(null))
		WebElement element = driver.findElement(by);
		return element;
		
	}
	
	public void enterintoTextbox(String LogicalName , String value) {
		
		//WebElement element = driver.findElement(By.id(logicalName));
		//driver.findElement(By.id(logicalName)) ---> getElement(logicalName);
		
		WebElement element = getElement(LogicalName);
		waitforVisibility(element,10);
		System.out.println("sText :" + element);
		element.sendKeys(value);
	}
	public void clickonButton(String logicalName) {
		WebElement element = getElement(logicalName);
		waitforVisibility(element,10);
		element.click();
	}
	public void waitforVisibility(WebElement element,int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		
}
