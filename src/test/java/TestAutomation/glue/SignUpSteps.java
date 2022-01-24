package TestAutomation.glue;

import TestAutomation.Pages.MailinatorPage;
import TestAutomation.Pages.SignUpPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SignUpSteps {
    @Then("^I click Register as provider$")
    public void i_click_Register_as_provider() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Click_provider();

    }

    @Then("^I Verify the Registration page displayed$")
    public void i_Verify_the_Registration_page_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.verify_Registrationpage();

    }

    @Then("^I Enter Health care system as '(.*)'$")
    public void i_Enter_Health_care_system_as_Mediguru(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_HCS(value);

    }

    @Then("^I Enter NPI as '(.*')$")
    public void i_Enter_NPI_as(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_NPI(value);

    }

    @Then("^I Enter speciality and services as 'physician'$")
    public void i_Enter_speciality_and_services_as_physician() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I click select provider type$")
    public void i_click_select_provider_type() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I click Doctor$")
    public void i_click_Doctor() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I Enter first name as '(.*)'$")
    public void i_Enter_first_name_as_john(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_firstname(value);

    }

    @Then("^I Enter last name as '(.*)'$")
    public void i_Enter_last_name_as_peter(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_lastname(value);

    }

    @Then("^I Enter city as '(.*)'$")
    public void i_Enter_city_as_seattle(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_City(value);

    }

    @Then("^I Enter state as '(.*)'$")
    public void i_Enter_state_as_washington(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_state(value);

    }

    @Then("^I Enter country as '(.*)'$")
    public void i_Enter_country_as_US(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_Country(value);

    }

    @Then("^I Enter zipcode as '(.*)'$")
    public void i_Enter_zipcode_as(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Enter_zipcode(value);

    }

    @Then("^I click Next Button$")
    public void i_click_Next_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Click_Nextbutton();

    }

    @And("^I Enter the verification code$")
    public void iEnterTheVerificationCode() {
        SignUpPage.enter_Verification_pin(MailinatorPage.value);
    }

    @Then("^I click next Button$")
    public void iClickNextButton() {
        SignUpPage.Click_NxtButton();
    }

    @Then("^I verify Third step page displayed$")
    public void iVerifyThirdStepPageDisplayed() {
        SignUpPage.verify_Thirdpage();
    }

    @And("^I Enter the username as '(.*)'$")
    public void iEnterTheUsernameAsJohnp(String value) {
        SignUpPage.Enter_Username(value);
    }

    @And("^I Enter the password as '(.*)'$")
    public void iEnterThePasswordAsHello(String value) {
        SignUpPage.Enter_Password(value);
    }

    @And("^I Enter the confirm password as '(.*)'$")
    public void iEnterTheConfirmPasswordAsHello(String value) {
        SignUpPage.Enter_ConfirmPassword(value);
    }

    @And("^I click the Register Now button$")
    public void iClickTheRegisterNowButton() {
        SignUpPage.Click_RegisterNow();
    }




    @And("^I click \"([^\"]*)\" as \"([^\"]*)\"$")
    public void iClickAs(String drop, String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SignUpPage.Click_DropDown(drop,value);

    }

    @And("^I upload the certificate file$")
    public void iUploadTheCertificateFile() {
        SignUpPage.Upload_File();

    }

    @And("^I Enter Speciality and Services as '(.*)'$")
    public void iEnterSpecialityAndServicesAsPhysician(String value) {
        SignUpPage.Enter_SS(value);

    }
    @And("^I Enter Email id as '(.*)'$")
    public void iEnterEmailIdAsJpMailinatorCom(String value) {
        SignUpPage.Enter_Email(value);
    }

    @And("^I Enter addressone as '(.*)'$")
    public void iEnterAddressoneAsAbc(String value) {
        SignUpPage.Enter_Addressone(value);
    }


    @And("^I upload a Profile Image$")
    public void iUploadAProfileImage() {
        SignUpPage.Profile_Upload();
    }


    @And("^I click Mobile Number$")
    public void iClickMobileNumber() {
        SignUpPage.Click_mobilenumber();

    }

    @And("^I click India$")
    public void iClickIndia() {
        SignUpPage.Click_India();

    }


    @And("^I Enter Mobile number as '(.*)'$")
    public void iEnterMobileNumberAs(String value) {
        SignUpPage.Enter_phonenumber(value);
    }

    @And("^I click OK Button$")
    public void iClickOKButton() {
        SignUpPage.Click_OkButton();
    }

    @And("^I click on Click Here link to login$")
    public void iClickOnClickHereLinkToLogin() {
        SignUpPage.Click_ClickHere();
    }

    @Then("^I verify the message as '(.*)'$")
    public void iVerifyTheMessageAsRegistrationComplete(String value) {
        SignUpPage.Verify_RegComplete();
    }

    @And("^I Drag the Image$")
    public void iDragTheImage() throws InterruptedException {
        SignUpPage.Drag_Drop();

    }
}
