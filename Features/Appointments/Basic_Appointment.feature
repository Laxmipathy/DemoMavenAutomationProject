@login
Feature: verify sample feature to test 'Basic Appointment'
  Scenario: Login with sample features to test Basic Appointment

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'keerthi'
    And   I enter the password as 'Hello123.'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    Then  I click the New Appointment
    And   I Enter Date of Birth as "12/02/2020"
    And   I Enter the Time as "07:30 p"
    And   I click "Duration" as "15 min"
    And   I Enter first name as 'keerthy'
    And   I Enter last name as 'suresh'
    And   I click Mobile Number
    And   I click India
    And   I Enter Mobile number as '9655803849'
    And   I Enter Email id as 'ks17@mailinator.com'
    And   I Enter the Reason for Visit as 'General Checkup'
    And   I click Create Button
    Then  I verify message as Appointment created successfully