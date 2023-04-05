package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2Practice {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		WebElement doc = driver.findElement(By.xpath("//span[text()='Documentation']"));
		doc.click();
		
		
		
		String expectedString = "The Selenium Browser Automation";
		String actualString = driver.findElement(By.xpath("//h1[text()='The Selenium Browser Automation Project']")).getText();
		
		if(expectedString.equals(actualString)) {
			System.out.println("Testing is passed");
		}else {
			System.out.println("Testing failed");
		}
		
		String sVersion = driver.findElement(By.xpath("//div[contains(text(),4)]")).getText();
		System.out.println(sVersion);
		String sExepcted = "v5.0";
		if(sVersion.equals(sExepcted)) {
			System.out.println("Text is matching! passed");
		}else {
			System.out.println("Text not failed");
		}
		
	}

}
