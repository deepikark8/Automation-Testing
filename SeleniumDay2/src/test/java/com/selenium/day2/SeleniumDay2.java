package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		

		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		
		WebElement submit = driver.findElement(By.id(""));
		submit.click();
		
		
		
		
	}

}
