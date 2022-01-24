package TestAutomation.glue;

import TestAutomation.Pages.Loginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepClass {

    @Then("^I verify the loginpage is displayed$")
    public void iVerifyTheLoginpageIsDisplayed() {
        Loginpage.verify_login_details_displayed();
    }

    @And("^I enter the username as '(.*)'$")
    public void iEnterTheUsernameAsJaddu(String value) {
        Loginpage.Enter_username(value);
    }

    @And("^I enter the password as '(.*)'$")
    public void iEnterThePasswordAsHello(String value) {
        Loginpage.Enter_password(value);
    }

    @Then("^I click the Login button$")
    public void iClickTheLoginButton() {
        Loginpage.Click_login();
    }

    @Then("^I verify the application page has been loggedin$")
    public void iVerifyTheApplicationPageHasBeenLoggedin() {
        Loginpage.verify_application_loggedin();
    }


    @Given("^I navigate to '(.*)'$")
    public void iNavigateToHttpsTesttelehealthMediguruComLogin(String value) {
        Loginpage.load();

    }

    @Then("^I click profile button$")
    public void iClickProfileButton() {
        Loginpage.Click_profileimage();

    }

    @And("^I click logout$")
    public void iClickLogout() {
        Loginpage.Click_logout();

    }

    @Then("^I verify application has been loggedoff$")
    public void iVerifyApplicationHasBeenLoggedoff() {
        Loginpage.verify_logoff();

    }

    @And("^I click the Forgot username link$")
    public void iClickTheForgotUsernameLink() {
        Loginpage.Click_ForgotUsername();
    }

    @And("^I click Get username button$")
    public void iClickGetUsernameButton() {
        Loginpage.Click_GetUsername();
    }

    @Then("^I verify the Alert message as '(.*)'$")
    public void iVerifyTheAlertMessageAsYourUsernameHasBeenSentToTheEmail(String value) {
        Loginpage.verify_AlertMsg();
    }

    @And("^I click Return to Login$")
    public void iClickReturnToLogin() {
        Loginpage.Click_ReturntoLogin();
    }

    @And("^I click Reset Password button$")
    public void iClickResetPasswordButton() {
        Loginpage.Click_ResetPassword();
    }

    @And("^I Enter the New password as '(.*)'$")
    public void iEnterTheNewPasswordAsHello(String value) {
        Loginpage.Enter_NewPassword(value);
    }

    @And("^I Enter the confirm password '(.*)'$")
    public void iEnterTheConfirmPasswordHello(String value) {
        Loginpage.Enter_ConfirmPassword(value);
    }

    @And("^I click Save Button$")
    public void iClickSaveButton() {
        Loginpage.Click_SaveButton();
    }

    @Then("^I verify the popup as Password Reset successfully$")
    public void iVerifyThePopupAsPasswordResetSuccessfully() {
        Loginpage.verify_PswdAlert();
    }


    @Then("^I click New Invite button$")
    public void iClickNewInviteButton() {
        Loginpage.ClickNewInviteButton();
    }

    @And("^I Enter MA Email as '(.*)'$")
    public void iEnterMAEmailAsMduMailinatorCom(String value) {
        Loginpage.Enter_MAemail(value);
    }

    @And("^I click send button$")
    public void iClickSendButton() {
        Loginpage.ClickSendButton();

    }

    @Then("^I verify Invite mail has been sent to MA$")
    public void iVerifyInviteMailHasBeenSentToMA() {
        Loginpage.verify_InvitePopupAlert();
    }

    @And("^I click Accept Button$")
    public void iClickAcceptButton() {
        Loginpage.ClickAcceptButton();
    }

    @Then("^I verify the Popup Alert as Invite Accepted$")
    public void iVerifyThePopupAlertAsInviteAccepted() {
        Loginpage.verify_InviteAcceptedPopup();
    }


    @Then("^I click MA Profile Button$")
    public void iClickMAProfileButton() {
        Loginpage.ClickMA_ProfileButton();
    }

    @And("^I click Assistants tab$")
    public void iClickAssistantsTab() {
        Loginpage.Click_Assistants();
    }

    @Then("^I verify the assistants screen is displayed$")
    public void iVerifyTheAssistantsScreenIsDisplayed() {
        Loginpage.verifyMenuAssistants();
    }

    @And("^I click the MA$")
    public void iClickTheMA() {
        Loginpage.ClickMA_Assistants();
    }

    @And("^I click the Revoke Assistance$")
    public void iClickTheRevokeAssistance() {
        Loginpage.ClickRevokeAssistance();
    }

    @Then("^I verify the Alert as Removed MA$")
    public void iVerifyTheAlertAsRemovedMA() {
        Loginpage.verifyRejectedMAPopup();
    }

    @And("^I click Dashboard$")
    public void iClickDashboard() {
        Loginpage.ClickDashboard();
    }

    @Then("^I verify Invite mail has been sent to Provider$")
    public void iVerifyInviteMailHasBeenSentToProvider() {
        Loginpage.verify_ProInvitePopupAlert();
    }

    @And("^I Enter Provider Email as '(.*)'$")
    public void iEnterProviderEmailAsKsMailinatorCom(String value) {
        Loginpage.Enter_Provideremail(value);
    }

    @And("^I click Providers tab$")
    public void iClickProvidersTab() {
        Loginpage.Click_ProvidersLink();
    }

    @Then("^I verify the providers screen is displayed$")
    public void iVerifyTheProvidersScreenIsDisplayed() {
        Loginpage.verifymenuProviders();
    }

    @And("^I click the provider$")
    public void iClickTheProvider() {
        Loginpage.ClickProvidersName();
    }

    @Then("^I verify the Alert as Removed Provider$")
    public void iVerifyTheAlertAsRemovedProvider() {
        Loginpage.verifyProviders_RejectedPopup();
    }
}
