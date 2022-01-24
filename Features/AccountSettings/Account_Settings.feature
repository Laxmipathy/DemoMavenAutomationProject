@login
Feature: verify sample feature to test 'Account settings'
  Scenario: Verify sample features to test Header Tabs in Account settings

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'jaddu'
    And   I enter the password as 'Hello123@'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    Then  I click profile button
    And   I click Account settings Button
    And   I Enter in Description as 'Bachelor of Dental Surgery'
    And   I click Update Button
    Then  I verify the popup message as User Profile Updated Successfully
    Then  I click profile button
    And   I click Account settings Button
    And   I click Certificates Tab
    And   I upload the certificate file
    Then  I verify User profile updated successfully
    And   I click Billing Tab
    And   I click the BillingOn Toggle button
    And   I click the security button
    And   I Enter the current password as 'Hello123@'
    And   I Enter the New Password as 'Hello123!'
    And   I Enter the Retype password as 'Hello123!'
    And   I click Save Button
    Then  I verify the popup message as User Profile Updated Successfully