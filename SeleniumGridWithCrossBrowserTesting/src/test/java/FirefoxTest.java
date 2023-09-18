import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class FirefoxTest {

	WebDriver driver;
	
	@Test
	public void HomePageCheck() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		//cap.setPlatform(Platform.ANY);
//		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");

		driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),cap);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("deepika ramkumar");
		System.out.println("Firefox - "+ driver.getTitle());


	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
