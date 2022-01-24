package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateOfBirthPage {



        public static String month = "November 1999";
        public static String day = "24";


        public static WebDriver driver;
        public static By DOB = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div/div[1]/input");
        public static By dob = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div/div[1]/div/div/table/thead/tr[1]/th[2]");
        public static By DP = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div/div[1]/div/div/table/thead/tr[1]/th[1]/span");
        public static By dp = By.xpath("//body/div[@id='app']//table[1]//tbody//tr//td[contains(text(),"+day+")]");



    public DateOfBirthPage() {
            driver = Hooks.driver;
        }

        public static void Click_DOB () {
        }
        public static void Click_dob () {
        }
        public static void Click_DP () {
        }
        public static void Click_dp () {
            try {
                Hooks.driver.findElement(DOB).click();
                Thread.sleep(3000);
                while (true) {
                    String text = Hooks.driver.findElement(dob).getText();
                    if (text.equals(month)) {
                        break;
                    } else {
                        Hooks.driver.findElement(DP).click();
                    }
                }
                Hooks.driver.findElement(dp).click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
