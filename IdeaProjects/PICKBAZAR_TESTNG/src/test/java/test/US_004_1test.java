package test;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US_004.US_004_1;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

import javax.xml.crypto.KeySelector;
import java.security.Key;

public class US_004_1test extends TestBaseReports {
    
   @Test
    public void us_004_1test(){

      Driver.getDriver().get(ConfigReader.getProperty("url"));
       extentTest = extentReports.createTest("PickBazarTest");

       US_004_1 coupon = new US_004_1();
       coupon.offresBtn.click();
       coupon.couponLists.get(2).click();
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
    actions.keyDown(Keys.CONTROL,'').keyDown(Keys.V)


       
       
   }
    
    
}
