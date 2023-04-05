package Day01.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;  



public class First {
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after method");
		
	}
	
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	
	public void beforeMethod() {
		
		System.out.println("before method");
	}
	
	@Test
	@Parameters({"username","password"})
	public void login(String username,String password) {
		
		System.out.println("first test");
		
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
}
