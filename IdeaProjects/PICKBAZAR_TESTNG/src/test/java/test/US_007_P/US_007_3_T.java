package test.US_007_P;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_2_P;
import pages.US_007_P.US_007_3_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_007_3_T extends TestBaseReports {


    @Test
    public void us_007_3_T() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("PickBazarTest", "");

        US_007_3_P customer3 = new US_007_3_P();
        extentTest = extentReports.createTest("PickBazarTest", " US_007_3_P  classindan customer4  obhesi olusturuldu");
        customer3.joinBtn.click();
        customer3.loginBtn.click();
        customer3.avatarBtn.click();
        customer3.myOrdersBtn.click();
        customer3.orderPendingBtn.click();


        Actions action = new Actions(Driver.getDriver());



    }

    }
