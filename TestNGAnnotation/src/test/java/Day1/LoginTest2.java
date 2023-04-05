package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {
	static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
			driver.get("https://selenium-prd.firebaseapp.com/");
	}
	
	@Test
	public void enterUserName() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");;
		
	
	}
	
	@Test
	
	public void userDetails() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");;
		
		 driver.findElement(By.id("password_field")).sendKeys("admin123");
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
	
}
