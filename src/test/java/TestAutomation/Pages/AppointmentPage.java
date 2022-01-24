package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static TestAutomation.glue.Hooks.wait;

public class AppointmentPage {

    public static WebDriver driver;
    public static By NewAppointment = By.xpath("//button[contains(.,'New Appointment')]");
    public static By Time = By.xpath("//div[@class='form-group']//label[contains(.,'Time')]/following-sibling::div//div//input");
    public static By Reason = By.name("reasonForVisit");
    public static By Create = By.xpath("//button[contains(.,'Create')]");
    public static By AppointmentPopup = By.xpath("//h5[@class='mb-1']");
    public static By Date_of_Birth = By.xpath("//div[@class='form-group']//label[contains(.,'Date')]/following-sibling::div//div//input");



    public AppointmentPage() {
        driver = Hooks.driver;
    }

    public static void Click_NewAppointment() {
        try {
            Hooks.driver.findElement(NewAppointment).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_Time(String value) {
        Hooks.driver.findElement(Time).sendKeys(value);
    }

    public static void Enter_Reason (String value){
        Hooks.driver.findElement(Reason).sendKeys(value);
    }

    public static void Click_Create() {
        try {
            Hooks.driver.findElement(Create).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_AppoitmentSuccess() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(AppointmentPopup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_Date_of_Birth(String value) {
        Hooks.driver.findElement(Date_of_Birth).sendKeys(value);
    }
}
