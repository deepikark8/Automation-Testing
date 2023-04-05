package com.day2.group;

import org.testng.annotations.Test;

public class PersonalLoan {
	
	
	@Test(groups = {"SmokeTest"})
	public void WebLogin() {
		System.out.println("Web Login Personal Loan");
	}
	
	@Test
	public void MobileLogin() {
		System.out.println("Mobile Login Personal Loan");
	}
	
	@Test
	public void APILogin() {
		System.out.println("API Login Personal Loan");
		
	}

}
