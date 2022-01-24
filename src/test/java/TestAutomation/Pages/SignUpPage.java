package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import TestAutomation.glue.SignUpSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

    public static WebDriver driver;
    public static By provider = By.xpath("//div[@class='provider_media rounded text-white pt-2 pb-2 pl-3 pr-3 cursor_p media']");
    public static By menu_identifier = By.xpath("//div[@class='mb-2 mt-5 p-4 card']");
    public static By Title = By.id("title");
    public static By providertype = By.name("providerType");
    public static By gender = By.id("gender");
    public static By HCS = By.name("healthCareSystem");
    public static By NPI = By.name("npiId");
    public static By SS = By.name("speciality");
    public static By upload = By.xpath("//input[@id='certificates-upload']");
    public static By firstname = By.name("firstName");
    public static By lastname = By.name("lastName");
    public static By email = By.name("email");
    public static By addressone = By.name("addressOne");
    public static By city = By.name("city");
    public static By state = By.name("state");
    public static By country = By.name("country");
    public static By zipcode = By.name("zipCode");
    public static By button = By.xpath("//button[contains(.,'Next')]");
    public static By enter_verification_pin = By.xpath("//input[@class='form-control otp-box ']");
    public static By nxt_button = By.xpath("//button[contains(.,'Next')]");
    public static By Menu_Identifier = By.xpath("//div[@class='text-center']");
    public static By Username = By.name("username");
    public static By Password = By.name("password");
    public static By ConfirmPassword = By.name("confirmPassword");
    public static By Registerbutton = By.xpath("//button[contains(.,'Register Now')]");
    public static By Menu_identifier = By.xpath("//div[contains(.,'Registration Complete')]");
    public static By ProfileUpload = By.xpath("//input[@id='file-upload']");
    public static By clickmobile = By.xpath("//div[@class='selected-flag']");
    public static By clickindia = By.xpath("//span[contains(.,'India')]");
    public static By enternumber = By.xpath("//input[@type='tel']");
    public static By okbutton = By.xpath("//button[@class='btn btn-primary']");
    public static By clickhere = By.cssSelector("a[href*='/login']");
    public static By src_dest = By.xpath("//div[@class='ReactCrop__drag-handle ord-se']");
    public static By duration = By.id("duration");


    public SignUpPage() {
        driver = Hooks.driver;
    }

    public static void Click_provider() {
        try {
            Hooks.driver.findElement(provider).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_Registrationpage() {
        try {
            Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(menu_identifier));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_DropDown(String drop, String value) {
        if (drop.equals("Title")) {
            Select title = new Select(Hooks.driver.findElement(Title));
            title.selectByVisibleText("Dr");
        } else if (drop.equals("provider type")) {
            Select Providertype = new Select(Hooks.driver.findElement(providertype));
            Providertype.selectByVisibleText("Doctor");
        } else if (drop.equals("gender")) {
            Select Gender = new Select(Hooks.driver.findElement(gender));
            Gender.selectByVisibleText("Male");
        } else {
            Select Duration = new Select(Hooks.driver.findElement(duration));
            Duration.selectByVisibleText("15 min");
        }
    }

        public static void Enter_HCS (String value){
            Hooks.driver.findElement(HCS).sendKeys(value);
        }

        public static void Enter_NPI (String value){
            Hooks.driver.findElement(NPI).sendKeys(value);
        }

        public static void Enter_SS (String value){
            Hooks.driver.findElement(SS).sendKeys(value);
        }

        public static void Upload_File () {
            Hooks.driver.findElement(upload).sendKeys("C:\\Users\\Spare User-4\\Desktop\\Architecting.pdf");

        }

        public static void Enter_firstname (String value){
            Hooks.driver.findElement(firstname).sendKeys(value);
        }

        public static void Enter_lastname (String value){
            Hooks.driver.findElement(lastname).sendKeys(value);
        }

        public static void Enter_Email (String value){
            Hooks.driver.findElement(email).sendKeys(value);
        }


        public static void Enter_Addressone (String value){
            Hooks.driver.findElement(addressone).sendKeys(value);
        }

        public static void Enter_City (String value){
            Hooks.driver.findElement(city).sendKeys(value);
        }

        public static void Enter_state (String value){
            Hooks.driver.findElement(state).sendKeys(value);
        }

        public static void Enter_Country (String value){
            Hooks.driver.findElement(country).sendKeys(value);
        }

        public static void Enter_zipcode (String value){
            Hooks.driver.findElement(zipcode).sendKeys(value);
        }

        public static void Click_Nextbutton () {
            try {
                Hooks.driver.findElement(button).click();
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void enter_Verification_pin (String value){

            Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(enter_verification_pin));
            String i = value.substring(value.length() - 6, value.length());
            Hooks.driver.findElement(enter_verification_pin).click();
            Hooks.driver.findElement(enter_verification_pin).sendKeys(i);
        }

        public static void Click_NxtButton () {
            try {
                Hooks.driver.findElement(nxt_button).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void verify_Thirdpage () {
            try {
                Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(Menu_Identifier));
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Enter_Username (String value){
            Hooks.driver.findElement(Username).sendKeys(value);
        }

        public static void Enter_Password (String value){
            Hooks.driver.findElement(Password).sendKeys(value);
        }

        public static void Enter_ConfirmPassword (String value){
            Hooks.driver.findElement(ConfirmPassword).sendKeys(value);
        }

        public static void Click_RegisterNow () {
            try {
                Hooks.driver.findElement(Registerbutton).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Verify_RegComplete () {
            try {
                Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(Menu_identifier));
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Profile_Upload () {
            try {
                Hooks.driver.findElement(ProfileUpload).sendKeys("C:\\Users\\Spare User-4\\Desktop\\starwars.jpg");
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public static void Click_mobilenumber () {
            try {
                Hooks.driver.findElement(clickmobile).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Click_India () {
            try {
                Hooks.driver.findElement(clickindia).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Enter_phonenumber (String value){
            Hooks.driver.findElement(enternumber).sendKeys(value);
        }

        public static void Click_OkButton () {
            try {
                Hooks.driver.findElement(okbutton).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Click_ClickHere () {
            try {
                Hooks.driver.findElement(clickhere).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void Drag_Drop () {
            try {
                Thread.sleep(4000);
                WebElement resizeElement = Hooks.driver.findElement(src_dest);
                Actions actionResize = new Actions(driver);
                actionResize.dragAndDropBy(resizeElement, 100, 50).perform();
                System.out.println("Done Resizing");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

