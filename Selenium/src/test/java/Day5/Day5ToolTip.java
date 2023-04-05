package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5ToolTip {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(5000);
		
		
		WebElement toolTip = driver.findElement(By.xpath("//*[@id='Layer_1']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(toolTip).build().perform();
		
		WebElement toolTipText = driver.findElement(By.xpath("//*[@id='Layer_1']//*[name()='title']"));
		
	
		String ActualStr = toolTipText.getText();
		String ExpectedStr = "Selenium logo green";
		System.out.println("test :"+ActualStr);
		
		compareText(ActualStr,ExpectedStr);
		
		
	}

	
		
	private static void compareText(String actualStr, String expectedStr) {
		// TODO Auto-generated method stub
		
		Assert.assertEquals(actualStr, expectedStr);
		
	}
	
	
	
	
}
