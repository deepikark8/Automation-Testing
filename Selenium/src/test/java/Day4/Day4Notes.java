package Day4;
/**
 * 
 * Using Methods 
 * Mouse over
 * Actions actions = new Actions(driver);
 * action.moveInElement(SwitchToTab).build().perform()
 * 
 * 
 * 
 * Pop-ups
 * 
 * driver.switchTo().alert().getText()
 * driver.switchto().alert().accept()
 *
 * 
 * 
 * alert
 * driver.switchTo().alert().accept();//CLick ok in popup	
 * 
 * 
 * 
 * Types of Wait
 * 
 * 	1.Implicit Wait
 * 	2.Explicit wait
 * 	3.Fluent wait
 * 
 * 
 * Implicit wait - is at Driver level
 *   It is driver level it is applied to all element.
 *   It will check every element and then perform
 *   You don't have flexibility based on elements to change the time.
 * 
 * Explicit wait - is at Element level
 * 	It is not driver level means it wont apply for all element
 * 	It is specific to the element which is loading late
 * 	Flexible for each element
 * 	None of the waits are waiting for the given time.It will be performed as soon as the element is available.
 * 	Time set is max time you should wait.
 * 	
 * Fluent wait - it will check for element - maximum time and minimum time - check the element  every 200 millisecond  
 * 	instead of asking webdriver to check we are making/enforcing  every 200 millisecond go and check
 * 
 * 
 * In terms of memory - explicit is good
 * in terms of execution - fluent wait is good
 * 
 * 
 *
 */

public class Day4Notes {

}
