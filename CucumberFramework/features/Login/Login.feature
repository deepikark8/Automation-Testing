Feature: Login.feature

@smoke @story1 @priority0
  Scenario: login to application with valid username and password
  Given User is on "LoginPage"
  When User enter into Textbox "Username" "admin123@gmail.com"
  Then User enter into Textbox "Password" "admin123"
  And click on Button "Login"
  Given User is on "HomePage"
  When click on Button "HomeTab"
  When User enter into Textbox "Name" "Deepika"
  

 
    #@regression @story1 @priority1
   #Scenario: login to application with valid username and password
    #Given User is on "LoginPage"
    #When User enter into Textbox "Username" "admin123@gmail.com"
    #Then User enter into Textbox "Password" "admin123"
    #And click on Button "Login"
    #Given User is on "HomePage"
   # When click on Button "HomeTab"
    #When User enter into Textbox "Name" "Deepika"
    #And click on Button "Logout"
    #Given User is on "LoginPage"
    #And User verifies the text "Heading" "Web login" 