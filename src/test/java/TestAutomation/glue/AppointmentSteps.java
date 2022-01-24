package TestAutomation.glue;

import TestAutomation.Pages.AppointmentPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AppointmentSteps {

    @Then("^I click the New Appointment$")
    public void i_click_the_New_Appointment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Click_NewAppointment();

    }

    @Then("^I click Create Button$")
    public void i_click_Create_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Click_Create();

    }

    @And("^I Enter the Reason for Visit as '(.*)'$")
    public void iEnterTheReasonForVisitAsGeneralCheckup(String value) {
        AppointmentPage.Enter_Reason(value);
    }

    @Then("^I verify message as Appointment created successfully$")
    public void iVerifyMessageAsAppointmentCreatedSuccessfully() {
        AppointmentPage.verify_AppoitmentSuccess();
    }


    @And("^I Enter Date of Birth as \"([^\"]*)\"$")
    public void iEnterDateOfBirthAs(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Enter_Date_of_Birth(value);

    }

    @And("^I Enter the Time as \"([^\"]*)\"$")
    public void iEnterTheTimeAs(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Enter_Time(value);

    }
}
