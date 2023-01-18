package test.US_004_P;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_004_P.US_004_1_P;
import pages.US_004_P.US_004_2_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_004_2T extends TestBaseReports {

   @Test
    public void us_004_2test(){

      Driver.getDriver().get(ConfigReader.getProperty("url"));
       extentTest = extentReports.createTest("PickBazarTest", "");

       US_004_2_P coupon2 = new US_004_2_P();

       coupon2.joinBtn.click();
       coupon2.loginBtn.click();
       coupon2.offresBtn.click();
       coupon2.coupon12.click();
       Assert.assertTrue(coupon2.coupon12.isDisplayed());
       coupon2.shopsBtn.click();
       coupon2.furnitureShopBtn.click();
       coupon2.ashDoubleBedBtn.click();
       coupon2.addToShoppingCartBtn.click();
       coupon2.shoppingBasketBtn.click();
       coupon2.checkOutBtn.click();
       coupon2.checkAvailabilityBtn.click();
       coupon2.doYouHaveCouponBtn.click();
       coupon2.pasteCouponBtn.click();
       Actions actions = new Actions(Driver.getDriver());
       actions.keyDown(Keys.CONTROL).sendKeys("V").perform();
       coupon2.applyBtn.click();

 double beforePrice = Double.parseDouble(coupon2.totalBefore.getText().substring(1));
    System.out.println("beforePrice = " + beforePrice);
       double afterPrice = Double.parseDouble(coupon2.totalAfter.getText().substring(1));
       System.out.println("afterPrice = " + afterPrice);

       Assert.assertNotEquals(beforePrice, afterPrice);


   }


}
