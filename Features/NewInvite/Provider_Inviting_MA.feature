@login
Feature: verify sample feature to test 'New Invite'
  Scenario: Login with provider to invite MA

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'kriti'
    And   I enter the password as 'Hello123.'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    Then  I click New Invite button
    And   I Enter MA Email as 'mdu.20@mailinator.com'
    And   I click send button
    Then  I verify Invite mail has been sent to MA
    Then  I click profile button
    And   I click logout
    Then  I verify application has been loggedoff
    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'kajal'
    And   I enter the password as 'Hello123.'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    And   I click Accept Button
    Then  I verify the Popup Alert as Invite Accepted
    Then  I click MA Profile Button
    And   I click logout
    Then  I verify application has been loggedoff


