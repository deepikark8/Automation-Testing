package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.base.BasePage;
import com.training.log.Log;

public class HomePage extends BasePage {

public HomePage(WebDriver driver) {		
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement HomeTab;
	
	@FindBy(id="name")
	WebElement firstname;
	
	@FindBy(id="lname")
	WebElement fathername;
	
	@FindBy(id="postaladdress")
	WebElement postaladdress;
	
	
	public void clickHomeTab() {	
		
		try {
			waitforVisibility(HomeTab,20);
			HomeTab.click();
			
		}catch(Exception e){
			
			Log.error(e.toString());
			
		}
		
		
	}
	
	public void enterintofirstname() {
		waitforVisibility(firstname,20);
		firstname.sendKeys("Deepika");
	}
	
	public void enterintofathername() {
		waitforVisibility(fathername,20);
		fathername.sendKeys("Ramkumar");
	}

	public void enterintopostalAddress() {
		waitforVisibility(postaladdress,20);
		postaladdress.sendKeys("597987");
	}
	
}
