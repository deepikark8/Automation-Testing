package com.day2.group;

import org.testng.annotations.Test;

public class MultipleGroupName {
	
	@Test(groups= {"Group A"})
	public void test1() {
		System.out.println("Test case belongs to Group A");
		
	}
	
	@Test(groups = {"Group A", "Group B"})
	public void test2() {
		
		System.out.println("Test case belongs to Group A & B");
		
	}
	
	@Test(groups = {"Group B"})
	public void test3() {
		System.out.println("Test case belongs to Group B");
	}
	

}
