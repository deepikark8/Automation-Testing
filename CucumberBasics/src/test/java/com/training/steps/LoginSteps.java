package com.training.steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	
	@Given("User launch the salesforce application")
	public void user_launch_the_salesforce_application() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
	}
	@When("User enter username")
	public void user_enter_username() {
		
		By username = By.id("username");
		driver.findElement(username).sendKeys("deepika@mh.com");
	    
	}
	@When("User enter password")
	public void user_enter_password() {
		
		By password = By.id("password");
		driver.findElement(password).sendKeys("password@123");
	   
	}
	
	@Then("click on Rememberme")
	public void click_on_rememberme() {
		driver.findElement(By.id("rememberUn")).click();
	    
	}
	
	@When("click on Login Button")
	public void click_on_login_button() {
		
	    driver.findElement(By.id("Login")).click();
	    
	}

@When("User enter username {string}")
public void user_enter_username(String username) {

	driver.findElement(By.id("username")).sendKeys(username);
    
}

@When("User enter password {string}")
public void user_enter_password(String password) {
    
	driver.findElement(By.id("password")).sendKeys(password);
	
}


	

}
