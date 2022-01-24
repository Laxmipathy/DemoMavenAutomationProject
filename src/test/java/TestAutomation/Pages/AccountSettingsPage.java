package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static TestAutomation.glue.AccountSettingsSteps.arrOfStr;
import static TestAutomation.glue.Hooks.wait;

public class AccountSettingsPage {

    public static WebDriver driver;
    public static By AccountSettings = By.xpath("//button[contains(.,'Account Settings')]");
    public static By Description = By.name("description");
    public static By UpdateButton = By.xpath("//button[contains(.,'Update')]");
    public static By popup = By.xpath("//h5[@class='mb-1']");
    public static By certificate = By.xpath("//a[contains(.,'Certificates')]");
    public static By AccountPopup = By.xpath("//h6[@class='mb-0 f_600']");
    public static By Billing = By.xpath("//a[contains(.,'Billing')]");
    public static By ToggleOn = By.xpath("//div[@class='react-switch-handle']");
    public static By Security = By.xpath("//a[contains(.,' Security')]");
    public static By currentpassword = By.name("currentPassword");
    public static By NewPassword = By.name("newPassword");
    public static By RetypeNewpPassword = By.name("confirmPassword");
    public static By AccountName = By.name("accountName");
    public static By AccountDescription = By.name("accountDescription");
    public static By Connect = By.xpath("//button[@class='connect-button float-right']");
    public static By testphonenumber = By.xpath("//div[@class='Box-root Flex-flex Flex-alignItems--baseline Flex-direction--row Flex-justifyContent--flexStart']//span[contains(.,'the test phone number')]");
    public static By StripeEmail = By.name("email");
    public static By StripeNxt = By.xpath("//span[@class='Button-label Text-color--white Text-fontSize--14 Text-fontWeight--medium Text-lineHeight--20 Text-numericSpacing--proportional Text-typeface--base Text-wrap--noWrap Text-display--block']//span[contains(.,'Next')]");
    public static By drpCountry = By.name("country");
    public static By clickcountry = By.xpath("//select[@id='country']");
    public static By UseTestCode = By.xpath("//span[@class='Button-label Text-color--default Text-fontSize--14 Text-fontWeight--medium Text-lineHeight--20 Text-numericSpacing--proportional Text-typeface--base Text-wrap--noWrap Text-display--block']//span[contains(.,'Use test code')]");
    public static By MENU_IDENTIFIER = By.xpath("//div[@class='FormBlock-header Box-root Padding-top--12 Padding-bottom--20 Padding-horizontal--20']");
    public static By Sfirstname = By.name("first_name");
    public static By Slastname = By.name("last_name");
    public static By Saddressone = By.name("address");
    public static By Saddresstwo = By.name("address-line2");
    public static By Scity = By.name("locality");
    public static By Szip = By.name("zip");
    public static By Sssn = By.name("ssn_last_4");
    public static By clickstate = By.xpath("//select[@id='subregion']");
    public static By drpstate = By.name("subregion");
    public static By Menu_Business = By.xpath("//div[@class='FormBlock-header Box-root Padding-top--12 Padding-bottom--20 Padding-horizontal--20']");
    public static By clickIndustry = By.xpath("//button[@name='industry']");
    public static By drpIndustry = By.xpath("//div[@class='Box-root Padding-left--16']//span[text()='Software']");
    public static By websitebusiness = By.name("business_profile[url]");
    public static By UseTestAccount = By.xpath("//span[@class='Button-label Text-color--default Text-fontSize--14 Text-fontWeight--medium Text-lineHeight--20 Text-numericSpacing--proportional Text-typeface--base Text-wrap--noWrap Text-display--block']//span[contains(.,'Use test account')]");
    public static By menu_Payout = By.xpath("//div[@class='FormBlock-header Box-root Padding-top--12 Padding-bottom--20 Padding-horizontal--20']");
    public static By StripeSave = By.xpath("//span[@class='Button-label Text-color--white Text-fontSize--14 Text-fontWeight--medium Text-lineHeight--20 Text-numericSpacing--proportional Text-typeface--base Text-wrap--noWrap Text-display--block']//span[contains(.,'Save')]");
    public static By StripeVerificationMenu = By.xpath("//div[@class='ContentHeader Box-root Box-background--offset Box-divider--light-bottom-1 Padding-horizontal--20 Padding-vertical--16 Flex-flex Flex-direction--column']");
    public static By StripeDone = By.xpath("//span[@class='Button-label Text-color--white Text-fontSize--14 Text-fontWeight--medium Text-lineHeight--20 Text-numericSpacing--proportional Text-typeface--base Text-wrap--noWrap Text-display--block']//span[contains(.,'Done')]");
    public static By DD = By.xpath("//input[@name='dob-day']");
    public static By MM = By.xpath("//input[@name='dob-month']");
    public static By YY = By.xpath("//input[@name='dob-year']");




    public AccountSettingsPage() {
        driver = Hooks.driver;
    }

    public static void Click_AccountSettings() {
        try {
            Hooks.driver.findElement(AccountSettings).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_Description(String value) {
        Hooks.driver.findElement(Description).sendKeys(value);
    }

    public static void Click_UpdateButton() {
        try {
            Hooks.driver.findElement(UpdateButton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_Popup() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_Certificate() {
        try {
            Hooks.driver.findElement(certificate).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_AccountPopup() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(AccountPopup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_Billing() {
        try {
            Hooks.driver.findElement(Billing).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_BillingOn() {
        try {
            Hooks.driver.findElement(ToggleOn).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_Security() {
        try {
            Hooks.driver.findElement(Security).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_currentpassword(String value) {
        Hooks.driver.findElement(currentpassword).sendKeys(value);
    }

    public static void Enter_New_Password(String value) {
        Hooks.driver.findElement(NewPassword).sendKeys(value);
    }

    public static void Enter_RetypeNew_Password(String value) {
        Hooks.driver.findElement(RetypeNewpPassword).sendKeys(value);
    }

    public static void Enter_AccountName(String value) {
        Hooks.driver.findElement(AccountName).sendKeys(value);
    }

    public static void Enter_AccountDescription(String value) {
        Hooks.driver.findElement(AccountDescription).sendKeys(value);
    }

    public static void Click_Connect() {
        try {
            Hooks.driver.findElement(Connect).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_TestPhoneNumber() {
        try {
            Hooks.driver.findElement(testphonenumber).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_StripeEmail(String value) {
        WebElement toClear = Hooks.driver.findElement(StripeEmail);
        toClear.sendKeys(Keys.CONTROL + "a");
        toClear.sendKeys(Keys.DELETE);
        Hooks.driver.findElement(StripeEmail).sendKeys(value);
    }

    public static void Click_StripeNext() {
        try {
            Hooks.driver.findElement(StripeNxt).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void StripeDropDown(String drop) {
        Select Country = new Select(Hooks.driver.findElement(drpCountry));
        Country.selectByIndex(34);

    }

    public static void ClickCountry() {
        try {
            String currentTab = Hooks.driver.getWindowHandle();
            for (String tab : Hooks.driver.getWindowHandles()) {
                if (!tab.equals(currentTab)) {
                    Hooks.driver.switchTo().window(tab);
                }
            }
            wait.until(ExpectedConditions.visibilityOfElementLocated(clickcountry)).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_UseTestCode() {
        try {
            Hooks.driver.findElement(UseTestCode).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_StripeMenu() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(MENU_IDENTIFIER));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_Sfirstname(String value) {
        Hooks.driver.findElement(Sfirstname).sendKeys(value);
    }

    public static void Enter_Slastname(String value) {
        Hooks.driver.findElement(Slastname).sendKeys(value);
    }

    public static void Enter_Saddressone(String value) {
        Hooks.driver.findElement(Saddressone).sendKeys(value);
    }

    public static void Enter_Saddresstwo(String value) {
        Hooks.driver.findElement(Saddresstwo).sendKeys(value);
    }

    public static void Enter_Scity(String value) {
        Hooks.driver.findElement(Scity).sendKeys(value);
    }

    public static void Enter_Szip(String value) {
        Hooks.driver.findElement(Szip).sendKeys(value);
    }

    public static void Enter_Sssn(String value) {
        Hooks.driver.findElement(Sssn).sendKeys(value);
    }

    public static void ClickState() {
        try {
            Hooks.driver.findElement(clickstate).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void StripeStatedropdown(String drop) {
        Select state = new Select(Hooks.driver.findElement(drpstate));
        state.selectByIndex(49);
    }

    public static void verifyMenuBusiness() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Menu_Business));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickIndustry() {
        try {
            Hooks.driver.findElement(clickIndustry).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void StripeIndustrydropdown(String drop) {
        try {
            Hooks.driver.findElement(drpIndustry).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_BusinessWebsite(String value) {
        Hooks.driver.findElement(websitebusiness).sendKeys(value);
    }

    public static void ClickUseTestAccount() {
        try {
            Hooks.driver.findElement(UseTestAccount).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifymenupayout() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(menu_Payout));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_StripeSave() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(StripeSave));
            Hooks.driver.findElement(StripeSave).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void VerifyStripeVerificationSummary() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(StripeVerificationMenu));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickStripeDone() {
        try {
            Hooks.driver.findElement(StripeDone).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_DateofBirth(String value) {
        Hooks.driver.findElement(DD).sendKeys(arrOfStr[0]);
        Hooks.driver.findElement(MM).sendKeys(arrOfStr[1]);
        Hooks.driver.findElement(YY).sendKeys(arrOfStr[2]);
    }

}
