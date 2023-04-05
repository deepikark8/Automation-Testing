package LaunchBrowserWithoutWDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowserWithoutWDM {
	public static void main(String[] args) {
		
		/*
		 * Set a system property “webdriver.chrome.driver” to the path of your ChromeDriver.exe
		 *  file and instantiate a ChromeDriver class:
		 * 
		 *  System.setProperty(“webdriver.chrome.driver”,”chromedriver location”); 
		 *  
		 */
	
	
		System.setProperty(
	            "webdriver.chrome.driver",
	            "/Users/rahade/Downloads/chromedriver_mac64/chromedriver");
		
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://www.google.com/");
	}
}
