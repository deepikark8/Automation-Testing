package com.Mar.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Day1OpenGoogle {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("Selenium");
		
		WebElement searchBtn = driver.findElement(By.name("btnK"));
		searchBtn.click();
		
		
		
		
	}

}
