package TestAutomation.glue;

import TestAutomation.SeleniumConfig.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by joshu on 24-12-2016.
 */
public class Hooks {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebDriver driver1;
    public static WebDriverWait wait1;




    @Before
    public void Initialize(){
        Driver driverclass = new Driver();
        driver = driverclass.Launch("chrome");
        wait = new WebDriverWait(driver,  60);

    }

//    @After
//    public void Terminate(){
//        driver.close();
//    }

}
