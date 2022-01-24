package TestAutomation.glue;

import TestAutomation.Pages.MailinatorPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MailinatorSteps {

    @Then("^I navigate to mailinator page$")
    public void i_navigate_to_mailinator_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MailinatorPage.load();

    }

    @Then("^I Enter Go button$")
    public void i_Enter_Go_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MailinatorPage.Click_GoButton();

    }

    @Then("^I verify mail page is displayed$")
    public void i_verify_mail_page_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MailinatorPage.verify_mailpage_displayed();

    }

    @And("^I Enter id as '(.*)'$")
    public void iEnterIdAsJpMailinatorCom(String value) {
        MailinatorPage.Enter_mailaddress(value);
    }

    @Then("^I click on Email verification mail$")
    public void iClickOnEmailVerificationMail() {
        MailinatorPage.Click_mailpage();
    }

    @And("^I Read the verification code$")
    public void iReadTheVerificationCode() {
        MailinatorPage.wait_till_Verification_pin_get_readed();
    }

    @And("^I '(.*)' the mailinator$")
    public void iCloseTheMailinator(String value) {
        MailinatorPage.close_mailinator();
    }
}
