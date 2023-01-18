package test.US_007_P;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_3_P;
import pages.US_007_P.US_007_4_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_007_4_T extends TestBaseReports {


    @Test
    public void us_007_4_T() {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_4_T() test case");
        extentTest.info("WishListden urun kaldirinca \"Successfully Removed from Wishlist!\" mesaji gorulmelidir");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanıcı URL ye gider");

        US_007_4_P customer4 = new US_007_4_P();
        extentTest.info(" US_007_4_P  classindan customer4  objesi olusturuldu");

        customer4.joinBtn.click();
        extentTest.info("Kullanici \"join\" butonuna tiklar.");
        customer4.loginBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar");
        customer4.avatarBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar gorur");
        customer4.shopsBtn.click();
        extentTest.info("Kullanici Shops bolumunden (Furniture shop) a gider");
        customer4.furnitureShopBtn.click();
        extentTest.info("Kullanici  (Furniture shop) a gider");
        customer4.ashDoubleBedBtn.click();
        extentTest.info("lk urun olan AshDouble Bed i tilar ");
        customer4.ashDoubleBedFavoriteBtn.click();
        extentTest.info("favori butonuna tiklar");
        customer4.avatarBtn.click();
        extentTest.info("Kullanici avatar sembolu uzerine tiklar");
        customer4.myWishLIstBtn.click();
        extentTest.info("Wish list butonuna tiklar ve sayfaya gider");
        customer4.ashDoubleBedBtn.click();
        extentTest.info("Listelenmis urunlerden istemedigi bir urunun remove butonuna tiklar");
        customer4.favoriteRemoveBtn.click();
        extentTest.info("Listelenmis urunlerden istemedigi bir urunun remove butonuna tiklar");


        //Successfully Removed from Wishlist! Yazisini gorur





    }

    }
