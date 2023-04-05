package com.day2.groups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {
	
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("Second Class - First Method");
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("In Before Test");
		
	}
	
	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("Second Class - Second Method");
	}
	
	@BeforeSuite(groups = {"smoke","regression"})
	public void beforeSuite() {
		System.out.println("Second Class - In Before Suite");
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	@Parameters({"username","password"})
	public void beforeMethod(String username, String password) {
		System.out.println("First Class - Before Method");
		System.out.println(username);
		System.out.println(password);
	}
	

}
