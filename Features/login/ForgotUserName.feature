@login
Feature: verify sample feature to test 'Forgot username' Flow

  Scenario: Verify the Forgot username flow

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I click the Forgot username link
    And   I Enter Email id as 'sm.18@mailinator.com'
    And   I click Get username button
    Then  I verify the Alert message as 'your username has been sent to the email'
    And   I click Return to Login
