Feature: Login scenarios of salesforce application

Background: Launching application - steps  that should run before every scenarios
Given User launch the salesforce application

Scenario: Login into salesforce with valid username and password
When User enter username 
When User enter password 
But click on Rememberme
And click on Login Button 
Then User is in homepage.

Scenario: Login into salesforce with valid username and password
When User enter username 
When User enter password 
But click on Rememberme
And click on Login Button 