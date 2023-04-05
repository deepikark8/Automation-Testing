package com.day2.group;

import org.testng.annotations.Test;

public class CarLoan {

	
	@Test
	public void WebLogin() {
		System.out.println("Web Login Car Loan");
	}
	
	@Test
	public void MobileLogin() {
		System.out.println("Mobile Login Car Loan");
	}
	
	@Test(groups = {"SmokeTest"})
	public void APILogin() {
		System.out.println("API Login Car Loan");
		
	}
	
}
