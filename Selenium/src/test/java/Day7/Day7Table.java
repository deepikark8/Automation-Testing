package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7Table {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		login();
		widget();
		table();
		
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
	
	public static void widget() {
		
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		waitforVisibility(element,5);
		element.click();
		
		
		
		WebElement autoComplete = driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		waitforVisibility(element,5);
		autoComplete.click();
		
		
	}
	
	public static void table() {
		
		List<WebElement> tableElement = driver.findElements(By.xpath("//table/tbody/tr/td/input"));
	
		
		for(WebElement element:tableElement) {
			
			String strText =  element.getAttribute("value");
			
			System.out.println(strText);
			
			if(strText.equalsIgnoreCase("Sameer")){
				System.out.println("Expected text available in the table");
				
				//Double click to edit
				
//				Actions action = new Actions(driver);
//				action.doubleClick(element).build().perform();
//				element.sendKeys("test");
				
				break;
				
			}else {
				System.out.println("Expected condition not available");
			}
	
		}
	}
	
	
	public static void waitforVisibility(WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		
	}
	
	
}
