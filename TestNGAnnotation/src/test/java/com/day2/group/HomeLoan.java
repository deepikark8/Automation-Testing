package com.day2.group;

import org.testng.annotations.Test;

public class HomeLoan {
	
	
	@Test(groups = {"SmokeTest"})
	public static void test1() {
		System.out.println("test1");
		
	}
	
	@Test
	public static void test2() {
		
	}
	
	
	@Test
	public void WebLogin() {
		System.out.println("Web Login Home Loan");
	}
	
	@Test(groups = {"SmokeTest"})
	public void MobileLogin() {
		System.out.println("Mobile Login Home Loan");
	}
	
	@Test
	public void APILogin() {
		System.out.println("API Login Home Loan");
		
	}
	

}
