@login
Feature: verify sample feature to test 'New Invite'
  Scenario: Login with MA to Revoke the Provider

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'kajal'
    And   I enter the password as 'Hello123.'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    And   I click Providers tab
    Then  I verify the providers screen is displayed
    And   I click the provider
    And   I click the Revoke Assistance
    Then  I verify the Alert as Removed Provider
    And   I click Dashboard
    Then  I click MA Profile Button
    And   I click logout
    Then  I verify application has been loggedoff
