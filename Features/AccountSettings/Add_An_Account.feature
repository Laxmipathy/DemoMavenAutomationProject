@login
Feature: verify sample feature to test 'Account settings'
  Scenario: Verify sample features to test Add an Account in Account settings

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'johnaaa'
    And   I enter the password as 'Hello123.'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    Then  I click profile button
    And   I click Account settings Button
    And   I click Billing Tab
    And   I click the BillingOn Toggle button
    And   I Enter the Account name as 'john'
    And   I Enter the Account Description as 'Billing'
    And   I click Connect with Stripe button
    And   I click country dropdown
    And   I click Country as "United States"
    And   I click the Test Phone Number
    And   I Enter Email Id as 'mdu.jp33@mailinator.com'
    And   I click the Next Button
    And   I click the use Test Code
    Then  I verify the Personal details page is displayed
    And   I Enter the First name as 'john'
    And   I Enter the Last name as 'peter'
    And   I Enter the date of birth as "17/10/1992"
    And   I Enter the Addressline one as '8401 Durham Rd.'
    And   I Enter the Addressline two as 'Hacienda Heights'
    And   I Enter the city as 'CA'
    And   I click state dropdown
    And   I click state as "washington"
    And   I Enter the zip as '91745'
    And   I Enter the ssn as '6757'
    And   I click the Next Button
    Then  I verify the Business details page is displayed
    And   I click select your Industry dropdown
    And   I click Industry as "software"
    And   I Enter the business website as 'cloudix.io'
    And   I click the Next Button
    Then  I verify the payout details page is displayed
    And   I click the use Test account
    And   I click the Save Button
    Then  I verify the Verification summary page is displayed
    And   I click Done button

    




