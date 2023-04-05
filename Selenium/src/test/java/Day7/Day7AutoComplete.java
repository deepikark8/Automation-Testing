package Day7;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7AutoComplete {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		login();
		widget();
		autoComplete("U","United States Of America");
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
		
		
		
		WebElement autoComplete = driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"));
		waitforVisibility(element,5);
		autoComplete.click();
		
		
	}
	
	
	public static void autoComplete(String input,String expectedInput) {
		
		
		WebElement country = driver.findElement(By.name("myCountry"));
		country.sendKeys(input);
		
		List<WebElement> countryList = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
		
		
		
		for(WebElement element:countryList) {
			
			System.out.println(element.getText());
			//String countryNameExpected = element.getText();
			waitforVisibility(element,10);
			if(element.getText().equalsIgnoreCase(expectedInput)){
				
				System.out.println("Matches with expected country name");
				element.click();
				
			}
			
		}
		
	}
	
	
	public static void waitforVisibility(WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		
	}
}
