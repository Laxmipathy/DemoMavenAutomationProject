package TestAutomation.Pages;

import TestAutomation.SeleniumConfig.Driver;
import TestAutomation.glue.Hooks;
import jdk.internal.org.objectweb.asm.Handle;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailinatorPage {

    public static String value;

    public static void launch() {
        Driver driver1class = new Driver();
        Hooks.driver1 = driver1class.Launch("chrome");
        Hooks.wait1 = new WebDriverWait(Hooks.driver1, 60);
    }

    public static void Terminate() {
        Hooks.driver1.close();
    }

    public static void load() {
        launch();
        Hooks.driver1.navigate().to("https://www.mailinator.com/");
    }

    public static By EmailAddress = By.xpath("//input[@type='text']");
    public static By Go_Button = By.xpath("//button[@class='btn btn-go-public h-auto']");
    public static By menu_identifier = By.xpath("//div[@class='col-md-12 col-sm-12 col-xs-12']");
    public static By mailpage = By.xpath("//a[@class='ng-binding']");
    public static By Pin_Identifier = By.xpath("//strong");


    public static void Enter_mailaddress(String value){
        Hooks.driver1.findElement(EmailAddress).sendKeys(value);
    }

    public static void Click_GoButton() {
        try {
            Hooks.driver1.findElement(Go_Button).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static void verify_mailpage_displayed() {
        try {
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(menu_identifier));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_mailpage() {
        try {
            Hooks.driver1.findElement(mailpage).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void wait_till_Verification_pin_get_readed() {

        try {
            Thread.sleep(2000);
            Hooks.driver1.switchTo().frame("msg_body");
            value = Hooks.driver1.findElement(Pin_Identifier).getText();
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(Pin_Identifier));
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void close_mailinator() {
        Terminate();
        Hooks.driver1.close();
    }

}
