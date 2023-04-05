package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Tab {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		login();
		moveToSwitchTo();
		clickWindow();
		clickNewTab();
		
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
	

	public static void moveToSwitchTo() {
		
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		waitforVisibility(element,5);
		element.click();
		
	}
	
	public static void clickWindow() {
		
		WebElement windowElement = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
		windowElement.click();
		
	}
	
	public static void clickNewTab() {
		
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Tab')]"));
		element.click();
		
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		
		// when you have two windows - getWindowHandle()
		String parentWindow = driver.getWindowHandle(); //---> GetWindowHandle will provide current window handle 
		System.out.println(parentWindow);
		
		//GetWindowHandles will provide all open windows
		for(String handle:driver.getWindowHandles()) {
	//	System.out.println(handle);	
		driver.switchTo().window(handle);//Switching Window
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		   
		WebElement searchElement = driver.findElement(By.name("q"));
		searchElement.sendKeys("Selenium");
		
		driver.switchTo().window(parentWindow);
		
		String parentTitleCurrent = driver.getTitle();
		System.out.println(parentTitleCurrent);
		
		
	}
	 
	
	public static void waitforVisibility(WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	

}
