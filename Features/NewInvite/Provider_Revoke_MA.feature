@login
Feature: verify sample feature to test 'New Invite'
  Scenario: Login with provider to Revoke the MA

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'kriti'
    And   I enter the password as 'Hello123.'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    And   I click Assistants tab
    Then  I verify the assistants screen is displayed
    And   I click the MA
    And   I click the Revoke Assistance
    Then  I verify the Alert as Removed MA
    And   I click Dashboard
    Then  I click MA Profile Button
    And   I click logout
    Then  I verify application has been loggedoff
    