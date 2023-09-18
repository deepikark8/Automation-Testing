import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class SafariTest {

	WebDriver driver;
	
	@Test
	public void HomePageCheck() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("safari");
		cap.setPlatform(Platform.MAC);
		
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),cap);
//		driver.get("https://www.facebook.com/");
//		System.out.println(driver.getTitle());

	    driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),cap);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("deepika ramkumar");
		System.out.println("Safari - "+ driver.getTitle());
		

	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}


}
