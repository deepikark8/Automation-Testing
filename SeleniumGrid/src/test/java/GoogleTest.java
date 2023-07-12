import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class GoogleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException {


		

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		//cap.setPlatform(Platform.LINUX);
		// set the timeout to a maximum of 300 seconds
		//cap.setCapability("browserstack.idleTimeout", "300");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.86.250:4444"),cap);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("deepika ramkumar");
		System.out.println(driver.getTitle());


	}


}
