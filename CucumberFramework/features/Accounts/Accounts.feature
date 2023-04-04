Feature: Accounts.feature

Scenario: Login into salesforce with valid username and password
Given User launch the salesforce application
When User enter into Textbox "username" "admin123@gmail.com" 
Then User enter into Textbox "password" "admin123"
And click on Button "Login"
And click on Button "Home"
Then User enter into Textbox "Name" "Deepika" 