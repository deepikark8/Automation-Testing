package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Calculator {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		login();
		calculator();
		
		
	}
	
	
	
	
	public static void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		
		WebElement userName = driver.findElement(By.id("email_field"));
		waitforVisibility(userName,5);
		userName.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		loginBtn.click();
		
		
		
	}
	
	
	public static void calculator() {
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Calculator']"));
		waitforVisibility(element,5);
		element.click();
		
		//driver.findElement(By.XPath("//input[@name='submit']")).getAttribute("value");
		
		WebElement num1Element = driver.findElement(By.xpath("//input[@value='2']"));
		 String num1 = num1Element.getAttribute("value");
		 System.out.println(num1);
		 num1Element.click();
		 
		 WebElement opElement = driver.findElement(By.xpath("//input[@value='+']"));
		 String op = opElement.getAttribute("value");
		 System.out.println(op);
		 opElement.click();
		
		 WebElement num2Element = driver.findElement(By.xpath("//input[@value='3']"));
		 String num2 = num2Element.getAttribute("value"); 
		 System.out.println(num2);
		 num2Element.click();
		 
		 
		 
		
		 
		WebElement element1 = driver.findElement(By.xpath("//input[@value='=']"));
		waitforVisibility(element1,5);
		element1.click();
		
		 
		
		WebElement displayElement = driver.findElement(By.id("display"));
	
		
		String actualResult = displayElement.getAttribute("value"); ;
		System.out.println("actualResult : "+ actualResult);
		 
		String expectedResult = "7";
		
		campareText(actualResult,expectedResult);
		
	}
	

	
	
	




	private static void campareText(String actualResult, String expectedResult) {
		// TODO Auto-generated method stub
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}




	public static void waitforVisibility(WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
