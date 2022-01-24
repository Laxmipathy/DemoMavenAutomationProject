package TestAutomation.glue;

import TestAutomation.Pages.DateOfBirthPage;
import cucumber.api.java.en.Then;

public class DateOfBirthSteps {

    @Then("^I Enter DOB as '(.*)'$")
    public void i_Enter_DOB_as(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DateOfBirthPage.Click_DOB();
        DateOfBirthPage.Click_dob();
        DateOfBirthPage.Click_DP();
        DateOfBirthPage.Click_dp();

    }
}
