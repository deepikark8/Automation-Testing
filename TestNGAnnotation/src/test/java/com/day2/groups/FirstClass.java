package com.day2.groups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstClass {
	
	
	@AfterTest
	public void AfterTest() {
		System.out.println("In After Test");
	}

	//@Test(groups = {"smoke"})
	//@Test(priority = 1)
	@Test(priority = 0, groups = { "smoke" })
	@Parameters({"username","password"})
	public void test1(String username,String password) {
		
		System.out.println("First  Class - First Method");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	//@Test(groups = {"regression"})
	@Test(priority = -1)
	public void test2() {
		System.out.println("First Clas - Second Method");
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	@Parameters({"username","password"})
	public void beforeMethod(String username, String password) {
		System.out.println("First Class - Before Method");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
}
