package test.US_004_P;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_004_P.US_004_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_004_1T extends TestBaseReports {

   @Test
    public void us_004_1test(){

      Driver.getDriver().get(ConfigReader.getProperty("url"));
       extentTest = extentReports.createTest("PickBazarTest", "");

       US_004_1_P coupon = new US_004_1_P();
       coupon.offresBtn.click();
       coupon.coupon12.click();
       Assert.assertTrue(coupon.coupon12.isDisplayed());
       coupon.shopsBtn.click();
       coupon.furnitureShopBtn.click();
       coupon.ashDoubleBedBtn.click();
       coupon.addToShoppingCartBtn.click();
       coupon.shoppingBasketBtn.click();
       coupon.checkOutBtn.click();
       coupon.loginBtn.click();
       coupon.checkAvailabilityBtn.click();
       coupon.doYouHaveCouponBtn.click();
       coupon.pasteCouponBtn.click();
       Actions actions = new Actions(Driver.getDriver());
       actions.keyDown(Keys.CONTROL).sendKeys("V").perform();
       coupon.applyBtn.click();

 double beforePrice = Double.parseDouble(coupon.totalBefore.getText().substring(1));
    System.out.println("beforePrice = " + beforePrice);
       double afterPrice = Double.parseDouble(coupon.totalAfter.getText().substring(1));
       System.out.println("afterPrice = " + afterPrice);

       Assert.assertNotEquals(beforePrice, afterPrice);


   }


}
