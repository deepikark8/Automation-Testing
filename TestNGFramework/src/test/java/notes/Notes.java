package notes;
/*
 * 
 * Automate TestCases
 * 
 * 
 *  BaseTest - common Actions should be moved in to base test (Inheritance)
 * 
 *  	 Test Cases - Sequence of steps - Calling/Sequencing all the Actions 
 *    
 *    		- Login Test
 *    		- Home Test
 *    
 *  BasePage - common to all the pages will be in base page
 *    
 *  	 Pages -contains Elements (add elements in corresponding page) & Actions - Eg enterUsername(), clickLogin()
 *   
 *    		- Login Page - eg: username,password,remember me
 *    		- Home Page
 *    
 *   
 *    Utilities - are used in testcases and pages
 *    	
 *    	- readExcel
 *    	- ReadProperty file
 *    	- ScreenShot
 *    	- ExtentReport - gives much more information about test cases are happening	
 *    
 * 	   
 *   
 *	 Use of having a framework
 *		- Organized way
 *		- Easy to maintain
 *		- Reusable
 * 		
 *
 * 
 * Project specific is testcases(keep changing for every application) and the pages (elements change for every application) 
 * 
 * 
 * 
 * //Create the object of the class. Page Object Model.
 * 
 * 
 * Why do you have listerners in the project
 * 		 - To create extent report
 *  
 *  How did you do generate ur extent report
 *  	 - I call the test listerner which actually implements itest listerner in my testNg.xml and we have done the implementation for generating the report.
 *  
 *  Test listener - is the main class which we are going to call
 *  ExtendTestManager - contains the filename where it as to be stored.
 *  ExtrendManager - 
 *  	
 *   
 *  Types of Selenium Framework 
 *  
 *  	- Data Driven Framework - automation takes place based on data we pass  
 *   	- Keyword driven Framework - write constant action, reuse keyword in different places... data is not changed... keyword will be automation.
 *   	- Hybrid Driven Framework - what we do is ... it has both data & keyword driven - page object model using page Factory
 *   
 *   
 *    
 *   1. Cutomise or parameterise the bowser initialisztion
 *   2. User parameters to get the browser name
 *   3. Take screen shot
 *   	- TakeScreenShot Interface
 *   	- Convert screenshot object to file - object
 *   	- Create a physical file object - giving the file location with extension
 *   	- save the screenshot file object to physical file location using FileUtils.copyfiles
 *   4. Extent Report
 *   	- It contains 3 files
 *   		* ExtentManager
 *   		* ExtentTestManager
 *   		* TestListner which is implementation of iTestListner interface
 *   	- Avenstack dependency - ExtentReport in pom.xml
 *   	- Need to call TestListner as Listner in testNG.xml
 *   5. Log
 *   	log4j
 *   		-log4j dependency
 *   		-log4j.xml
 *   		- Log.java
 *   	- you give the file name in log4j.xml
 *   	- INFO, WARN,ERROR
 *   
 *   
 * 
 * 
 */

public class Notes {

}
