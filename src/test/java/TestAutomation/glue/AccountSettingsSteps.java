package TestAutomation.glue;

import TestAutomation.Pages.AccountSettingsPage;
import TestAutomation.Pages.SignUpPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AccountSettingsSteps {

    public static String[] arrOfStr;

    @Then("^I click Account settings Button$")
    public void i_click_Account_settings_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AccountSettingsPage.Click_AccountSettings();

    }


    @And("^I Enter in Description as '(.*)'$")
    public void iEnterInDescriptionAsBachelorOfDentalSurgery(String value) {
        AccountSettingsPage.Enter_Description(value);
    }

    @And("^I click Update Button$")
    public void iClickUpdateButton() {
        AccountSettingsPage.Click_UpdateButton();
    }

    @Then("^I verify the popup message as User Profile Updated Successfully$")
    public void iVerifyThePopupMessageAsUserProfileUpdatedSuccessfully() {
        AccountSettingsPage.verify_Popup();
    }

    @And("^I click Certificates Tab$")
    public void iClickCertificatesTab() {
        AccountSettingsPage.Click_Certificate();
    }

    @Then("^I verify User profile updated successfully$")
    public void iVerifyUserProfileUpdatedSuccessfully() {
        AccountSettingsPage.verify_AccountPopup();
    }

    @And("^I click Billing Tab$")
    public void iClickBillingTab() {
        AccountSettingsPage.Click_Billing();
    }

    @And("^I click the BillingOn Toggle button$")
    public void iClickTheBillingOnToggleButton() {
        AccountSettingsPage.Click_BillingOn();
    }

    @And("^I click the security button$")
    public void iClickTheSecurityButton() {
        AccountSettingsPage.Click_Security();
    }

    @And("^I Enter the current password as '(.*)'$")
    public void iEnterTheCurrentPasswordAsHello(String value) {
        AccountSettingsPage.Enter_currentpassword(value);
    }

    @And("^I Enter the New Password as '(.*)'$")
    public void iEnterTheNewPasswordAsHello(String value) {
        AccountSettingsPage.Enter_New_Password(value);
    }

    @And("^I Enter the Retype password as '(.*)'$")
    public void iEnterTheRetypePasswordAsHello(String value) {
        AccountSettingsPage.Enter_RetypeNew_Password(value);
    }

    @And("^I Enter the Account name as '(.*)'$")
    public void iEnterTheAccountNameAsJohn(String value) {
        AccountSettingsPage.Enter_AccountName(value);
    }

    @And("^I Enter the Account Description as '(.*)'$")
    public void iEnterTheAccountDescriptionAsBilling(String value) {
        AccountSettingsPage.Enter_AccountDescription(value);
    }

    @And("^I click Connect with Stripe button$")
    public void iClickConnectWithStripeButton() {
        AccountSettingsPage.Click_Connect();
    }

    @And("^I click the Test Phone Number$")
    public void iClickTheTestPhoneNumber() {
        AccountSettingsPage.Click_TestPhoneNumber();
    }

    @And("^I Enter Email Id as '(.*)'$")
    public void iEnterEmailIdAsMduJpMailinatorCom(String value) {
        AccountSettingsPage.Enter_StripeEmail(value);
    }

    @And("^I click the Next Button$")
    public void iClickTheNextButton() {
        AccountSettingsPage.Click_StripeNext();
    }

    @And("^I click Country as \"([^\"]*)\"$")
    public void iClickCountryAs(String drop) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AccountSettingsPage.StripeDropDown(drop);
      }

    @And("^I click country dropdown$")
    public void iClickCountryDropdown() {
        AccountSettingsPage.ClickCountry();
    }

    @And("^I click the use Test Code$")
    public void iClickTheUseTestCode() {
        AccountSettingsPage.Click_UseTestCode();
    }

    @Then("^I verify the Personal details page is displayed$")
    public void iVerifyThePersonalDetailsPageIsDisplayed() {
        AccountSettingsPage.verify_StripeMenu();
    }

    @And("^I Enter the First name as '(.*)'$")
    public void iEnterTheFirstNameAsKeerthy(String value) {
        AccountSettingsPage.Enter_Sfirstname(value);
    }

    @And("^I Enter the Last name as '(.*)'$")
    public void iEnterTheLastNameAsSuresh(String value) {
        AccountSettingsPage.Enter_Slastname(value);
    }

    @And("^I Enter the Addressline one as '(.*)'$")
    public void iEnterTheAddresslineOneAsDurhamRd(String value) {
        AccountSettingsPage.Enter_Saddressone(value);
    }

    @And("^I Enter the Addressline two as '(.*)'$")
    public void iEnterTheAddresslineTwoAsHaciendaHeights(String value) {
        AccountSettingsPage.Enter_Saddresstwo(value);
    }

    @And("^I Enter the city as '(.*)'$")
    public void iEnterTheCityAsCA(String value) {
        AccountSettingsPage.Enter_Scity(value);
    }

    @And("^I Enter the zip as '(.*)'$")
    public void iEnterTheZipAs(String value) {
        AccountSettingsPage.Enter_Szip(value);
    }

    @And("^I Enter the ssn as '(.*)'$")
    public void iEnterTheSsnAs(String value) {
        AccountSettingsPage.Enter_Sssn(value);
    }

    @And("^I click state as \"([^\"]*)\"$")
    public void iClickStateAs(String drop) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AccountSettingsPage.StripeStatedropdown(drop);
    }

    @And("^I click state dropdown$")
    public void iClickStateDropdown() {
        AccountSettingsPage.ClickState();
    }

    @Then("^I Enter the date of birth as \"([^\"]*)\"$")
    public void i_Enter_the_date_of_birth_as(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         arrOfStr = value.split("/");
         AccountSettingsPage.Enter_DateofBirth(value);

    }

    @Then("^I verify the Business details page is displayed$")
    public void iVerifyTheBusinessDetailsPageIsDisplayed() {
        AccountSettingsPage.verifyMenuBusiness();
    }

    @Then("^I click select your Industry dropdown$")
    public void i_click_select_your_Industry_dropdown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AccountSettingsPage.ClickIndustry();

    }


    @And("^I click Industry as \"([^\"]*)\"$")
    public void iClickIndustryAs(String drop) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AccountSettingsPage.StripeIndustrydropdown(drop);

    }

    @And("^I Enter the business website as '(.*)'$")
    public void iEnterTheBusinessWebsiteAsCloudixIo(String value) {
        AccountSettingsPage.Enter_BusinessWebsite(value);
    }

    @Then("^I verify the payout details page is displayed$")
    public void iVerifyThePayoutDetailsPageIsDisplayed() {
        AccountSettingsPage.verifymenupayout();

    }

    @And("^I click the use Test account$")
    public void iClickTheUseTestAccount() {
        AccountSettingsPage.ClickUseTestAccount();
    }

    @And("^I click the Save Button$")
    public void iClickTheSaveButton() {
        AccountSettingsPage.Click_StripeSave();
    }

    @Then("^I verify the Verification summary page is displayed$")
    public void iVerifyTheVerificationSummaryPageIsDisplayed() {
        AccountSettingsPage.VerifyStripeVerificationSummary();
    }

    @And("^I click Done button$")
    public void iClickDoneButton() {
        AccountSettingsPage.ClickStripeDone();
    }
}
