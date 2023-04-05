package com.Mar.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Practice {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHdnR_eTqCWZxRVfQKixDcywBfqwqyFepqx7dkROjVYzWkuTZA_xOkIxK2l7chtIp9kmRDlK&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement searchBar = driver.findElement(By.id("identifierId"));
		searchBar.sendKeys("deepikark8@gmail.com");
//		WebElement btnSearch = driver.findElement(By.name("btnK"));
//		btnSearch.click();
		
	}

}
