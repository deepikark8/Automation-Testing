package Robo;


import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoboExample {
	
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.selenium.dev/");
		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		Thread.sleep(10000);
		
		//Mouse
//		robot.mouseMove(530, 150);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //--->mouse click 
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //---> mouse release
//		
//		
		//Keyboard
	//	robot.keyPress(KeyEvent.VK_CONTROL);
		
		//Zoom in
		for (int i = 0; i < 3; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(5000);
		  System.out.println("About to zoom out");
		  for (int i = 0; i < 4; i++) {
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_SUBTRACT);
		   robot.keyRelease(KeyEvent.VK_SUBTRACT);
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		  }
		
	//	robot.mouseWheel(50);
		
		
		
		
		
		
		
	}

}
