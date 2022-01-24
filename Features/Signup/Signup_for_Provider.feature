@signup
  Feature: Verify sample feature to test 'signup' page

    Scenario: Signup flow for provider Registration

      Given I navigate to 'https://testtelehealth.mediguru.com/login'
      Then  I verify the loginpage is displayed
      And   I click Register as provider
      Then  I Verify the Registration page displayed
      And   I click "Title" as "DR"
      And   I Enter Health care system as 'Mediguru'
      And   I Enter NPI as '435465656'
      And   I Enter Speciality and Services as 'physician'
      And   I click "provider type" as "Doctor"
      And   I upload the certificate file
      And   I Enter first name as 'john'
      And   I Enter last name as 'peter'
      And   I Enter Email id as 'jp33@mailinator.com'
      And   I click Mobile Number
      And   I click India
      And   I Enter Mobile number as '9655803849'
      And   I Enter DOB as '11/24/1999'
      And   I click "gender" as "Male"
      And   I Enter addressone as 'abc123'
      And   I Enter city as 'seattle'
      And   I Enter state as 'washington'
      And   I Enter country as 'US'
      And   I Enter zipcode as '98100'
      And   I click Next Button
      Then  I navigate to mailinator page
      And   I Enter id as 'jp33@mailinator.com'
      And   I Enter Go button
      Then  I verify mail page is displayed
      Then  I click on Email verification mail
      And   I Read the verification code
      And   I 'close' the mailinator
      And   I Enter the verification code
      Then  I click next Button
      Then  I verify Third step page displayed
      And   I Enter the username as 'johnaaa'
      And   I Enter the password as 'Hello123.'
      And   I Enter the confirm password as 'Hello123.'
#      And   I upload a Profile Image
#      And   I Drag the Image
#      And   I click OK Button
      And   I click the Register Now button
      Then  I verify the message as 'Registration complete'
      And   I click on Click Here link to login
      Then  I verify the loginpage is displayed



