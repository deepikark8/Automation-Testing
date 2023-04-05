package Day5;
/**
 * 
 * 
 * 
 * Double Click - Action Class
 * action.doubleClick(doubleClickBtn).build().perform();
 * 
 * Tool tip - Information displayed on the top of mouse hover
 * action.moveToElement(toolTip).build().perform();
 * 
 * 
 * 
 * Drag & Drop - action class - Drag from  element and drop to element
 * 
 * 
 * 
 * iframe - many elements will be in the frame - switchToFrame and then perform
 * driver.switchTo().frame(imageiframe);
 * 
 * 
 * Assert - Using TestNG - we need to ad testNG dependency in the pom
 * 
 *   compareText - if it didn't  match then it will throw error with expected vs actual text 
 *   xpath - using the tagName 
 * compareText(ActualStr,ExpectedStr);
 * 
 * 
 */ 


  //* - this is to get all everything inside that tagname

//span[@class='navbar.logo']//*[name()='svg']//*[name()='title']

//*[@id='Layer_1']//*[name()='title']  

 //  (//*[name()='title'])[2] - by index - multiple element in same tagname
 
public class Day5Notes {

}
