package Day4;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4 {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		
		//Thread.sleep(5000);
		
		WebElement userName = driver.findElement(By.id("email_field"));
		userName.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		loginBtn.click();
		
		//Thread.sleep(5000);
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		//explicitWaitVisibility(loginBtn,10);
		
		//Fluent wait Visibility
		fluentWaitVisibility(loginBtn);
		
		//Methods
		switchTo();
		alert();
		popup();
		promptAlert();
	}
	
	//Mouse over
	public static void switchTo() {
		
		WebElement switchToTab = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		Actions action = new Actions(driver);
		action.moveToElement(switchToTab).build().perform();	
	}
	
	public static void alert() {
		
		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert']"));
		alert.click();
		
	}
	//Pop ups
	public static void popup() throws Exception {
		
		WebElement windowAlert = driver.findElement(By.xpath("//button[text()='Window Alert']"));
		windowAlert.click();
		//Thread.sleep(5000);
		
		//Explicit wait
		//explicitWaitVisibility(windowAlert,10);
		
		//Fluent wait
		fluentWaitVisibility(windowAlert);
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();//CLick ok in popup	
	}
	
	public static void promptAlert() throws Exception {
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Promt Alert']"));
		promptAlert.click();
		String strText = driver.switchTo().alert().getText();
		System.out.println(strText);
		
		//Thread.sleep(5000);
		
		//Explicit wait
		//explicitWaitVisibility(promptAlert,10);
		
		//Fluent wait
		fluentWaitVisibility(promptAlert);
	}
	
	//Explicit wait
	public static void explicitWaitVisibility(WebElement element,int time) {
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		
	}
	
	//Fluent Wait
	public static void fluentWaitVisibility(WebElement element) {
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(10,TimeUnit.SECONDS);
		wait.pollingEvery(200,TimeUnit.MILLISECONDS); //this is the line which makes the fluent wait different from explicit wait
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
