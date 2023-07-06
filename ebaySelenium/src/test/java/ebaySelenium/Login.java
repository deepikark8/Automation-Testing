package ebaySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		login();
		
	}
	
	
	public static void login() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		element.click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue with Google')]")).click();	
		
		driver.findElement(By.id("identifierId")).sendKeys("deepikavrk@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}
	

}
