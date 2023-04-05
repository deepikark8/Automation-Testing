package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5DragDrop {
	public static void main(String[] args) throws InterruptedException {
		
		
		//https://www.globalsqa.com/demo-site/draganddrop/
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement imageiframe = driver.findElement(By.xpath("//iframe[@class ='demo-frame lazyloaded']"));
		driver.switchTo().frame(imageiframe);
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		
		
		WebElement dragFrom = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement dropTo = driver.findElement(By.id("trash"));
		action.dragAndDrop(dragFrom, dropTo).build().perform();
		
		
		
	}

}
