@login
  Feature: verify sample feature to test 'login and logoff'
    Scenario: Login with corect username and password

      Given I navigate to 'https://testtelehealth.mediguru.com/login'
      Then  I verify the loginpage is displayed
      And   I enter the username as 'jaddu'
      And   I enter the password as 'Hello123@'
      Then  I click the Login button
      Then  I verify the application page has been loggedin
      Then  I click profile button
      And   I click logout
      Then  I verify application has been loggedoff
