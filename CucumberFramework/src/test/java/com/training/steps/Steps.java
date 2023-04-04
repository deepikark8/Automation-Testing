package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest{

	BasePage page ;
	PageFactory pageFactory = new PageFactory();

	@Before
	public void setup() throws IOException{
		launchApplication();
	}
	@Given("User is on {string}")
	public void user_is_on(String Page) {
		try {
			page = pageFactory.initialize(Page);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//page = new LoginPage();
	}

	@When("User enter into Textbox {string} {string}")
	public void user_enter_into_textbox(String logicalName, String value) {
		page.enterintoTextbox(logicalName, value);
		
	}


	@Then("click on Button {string}")
	public void click_on_button(String logicalName) {
		page.clickonButton(logicalName);
	}
	
	@Given("User verifies the text {string} {string}")
	public void user_verifies_the_text(String string, String string2) {
	   
	}

	//Salesforce	
	@Given("User launch the salesforce application")
	public void user_launch_the_salesforce_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@After
	public void teardown(Scenario scenario) {
		
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		driver.close();
		driver=null;
	}
	
}
