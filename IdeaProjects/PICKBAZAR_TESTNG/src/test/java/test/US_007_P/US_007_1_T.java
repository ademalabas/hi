package test.US_007_P;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_007_1_T extends TestBaseReports {


    @Test
    public void us_007_1_T() {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_1_T() test case");
        extentTest.info("Logout dan cikis yapabilmelidir");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("ConfigReader ile Urly gidildi");

        US_007_1_P customer = new US_007_1_P();
        extentTest.info(" US_007_1_P  classindan customer4  objesi olusturuldu");
        customer.joinBtn.click();
        customer.loginBtn.click();
        customer.avatarBtn.click();
        customer.profileBtn.click();
        customer.nameInput.click();
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys((ConfigReader.getProperty("ProfilName"))).perform();
        customer.bioInput.click();
        action.sendKeys((ConfigReader.getProperty("bio"))).perform();
        customer.saveBtn.click();



    }

    }
