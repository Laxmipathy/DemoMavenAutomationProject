@login
Feature: verify sample feature to test 'Forgot Password' Flow

  Scenario: Verify the Forgot Password flow

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I click the Forgot username link
    And   I Enter Email id as 'sm.18@mailinator.com'
    And   I click Reset Password button
    Then  I navigate to mailinator page
    And   I Enter id as 'sm.18@mailinator.com'
    And   I Enter Go button
    Then  I verify mail page is displayed
    Then  I click on Email verification mail
    And   I Read the verification code
    And   I 'close' the mailinator
    And   I Enter the verification code
    Then  I verify Third step page displayed
    And   I Enter the New password as 'Hello123&'
    And   I Enter the confirm password 'Hello123&'
    And   I click Save Button
    Then  I verify the popup as Password Reset successfully
