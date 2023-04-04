package com.training.pages;

import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class AccountsPage extends BasePage {

	static WebDriver driver;
	public AccountsPage() {
		super(driver = BaseTest.getDriver());
		
	}

}
