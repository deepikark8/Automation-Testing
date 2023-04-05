package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		
		Thread.sleep(5000);
		
		login();
		moveToInteractions();
		//doubleClick();
		toolTip();
		
		
	}
	
	
	public static void login() throws InterruptedException {
		
		
		
		
		WebElement username = driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		loginBtn.click();
		
		
		
	}
	
	
	public static void moveToInteractions() {
		
		WebElement intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
		waitforVisibility(intractions,10);
		intractions.click();
		
		
		
		
	}
	
	public static void doubleClick() {
		
		WebElement doubleClick = driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"));
		doubleClick.click();
		
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickBtn).build().perform();
		
	}
	
	public static void toolTip() throws InterruptedException {
		WebElement toolTip = driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]"));
		toolTip.click();
		
		Thread.sleep(5000);
		//waitforVisibility(toolTip,10);
		
		WebElement toolTipRight = driver.findElement(By.className("tooltipr"));
		Actions action = new Actions(driver);
		action.moveToElement(toolTipRight).build().perform();
		
		WebElement toolTipRightRt = driver.findElement(By.className("tooltiptextr"));
		String ActualStr = toolTipRightRt.getText();
		String ExpectedStr = "Right";
		
		
		compareText(ActualStr,ExpectedStr);
		
		
	}
	
	
	private static void compareText(String ActualText,String ExpectedText) {
		// TODO Auto-generated method stub
		Assert.assertEquals(ActualText, ExpectedText);
		
	}


	public static void waitforVisibility(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		}
	
	

}
