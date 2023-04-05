package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		
		//To maximise the Browser
		driver.manage().window().maximize();
		
		//Get the title name for verification
		String title = driver.getTitle();
		System.out.println(title);
		
	/*	String expectedTxt = "Selenium test";
		if(title.equals(expectedTxt)) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
		*/
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		loginBtn.click();
		
		Thread.sleep(5000);
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Your name..']"));
		name.sendKeys("Deepika");
		
		
		WebElement fatherName = driver.findElement(By.xpath("//input[@placeholder='father name..']"));
		fatherName.sendKeys("Rajakumar");
		
		
		WebElement postalAddress = driver.findElement(By.cssSelector("input#postaladdress"));
		postalAddress.sendKeys("90001");
		
		WebElement address = driver.findElement(By.cssSelector("input#personaladdress"));
		address.sendKeys("123 XYZ Street");
		
		
		//Radio Button
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='female']"));
		radioBtn.click();
		
		
		//Drop down
		WebElement cityDropDown = driver.findElement(By.id("city"));
		Select city = new Select(cityDropDown);
		city.selectByValue("newdelhi");
		
		
		WebElement courseDropDown = driver.findElement(By.id("course"));
		Select course = new Select(courseDropDown);
		course.selectByVisibleText("B.TECH");
		
		WebElement districtDropDown = driver.findElement(By.id("district"));
		Select district = new Select(districtDropDown);
		district.selectByIndex(3);
		
		WebElement  stateDropDown = driver.findElement(By.id("state"));
		Select state = new Select(stateDropDown);
		state.selectByVisibleText("UP");
		
		
		WebElement pincode = driver.findElement(By.cssSelector("input#pincode"));
		pincode.sendKeys("50009");
		
		WebElement emailId = driver.findElement(By.cssSelector("input#emailid"));
		emailId.sendKeys("test@123.com");
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
		
		
		
	}

}
