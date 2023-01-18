package test.US_007_P;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_1_P;
import pages.US_007_P.US_007_2_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_007_2_T extends TestBaseReports {


    @Test
    public void us_007_2_T() {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_2_T() test case");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("ConfigReader ile Urly gidildi");

        US_007_2_P customer2 = new US_007_2_P();
        extentTest = extentReports.createTest("PickBazarTest", " US_007_2_P  classindan customer4  obhesi olusturuldu");
        customer2.joinBtn.click();
        customer2.loginBtn.click();
        customer2.avatarBtn.click();
        customer2.profileBtn.click();
        customer2.changePasswordBtn.click();
        customer2.oldPasswordInput.click();
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys((ConfigReader.getProperty("oldpass"))).perform();
        customer2.newPasswordInput.click();
        action.sendKeys((ConfigReader.getProperty("newpass"))).perform();
        customer2.confirmPasswordInput.click();
        action.sendKeys((ConfigReader.getProperty("confirmpass"))).perform();
        customer2.saveBtn.click();



    }

    }
