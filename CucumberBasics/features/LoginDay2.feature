Feature: Login scenarios of salesforce application

Scenario Outline: Login into salesforce with valid username and password
Given User launch the salesforce application
When User enter username "<username>"
When User enter password "<password>"
But click on Rememberme
And click on Login Button 


Examples: 
|username|password|
|deepika@mh.com|password@123|
|admin123@gmail.com|admin123|