package pages.US_004;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_004_1 {
    public US_004_1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[text()='Offers']")
    public WebElement offresBtn;

    //   //div[@class='coupon-card']   kuponlar listesi

    @FindBy(xpath = "//div[@class='coupon-card']")
    public List<WebElement> couponLists;

    @FindBy(xpath="//a[text()='Shops']")
    public WebElement shopsBtn;

    //  //span[text()='Furniture Shop']

    @FindBy(xpath="//span[text()='Furniture Shop']")
    public WebElement furnitureShopBtn;

    //  //h3[text()='Ash Double Bed']

    @FindBy(xpath="//h3[text()='Ash Double Bed'] ")
    public WebElement ashDoubleBedBtn;

    //    //span[text()='Add To Shopping Cart']      Sopping sepetine ekleme butonu
    @FindBy(xpath="//span[text()='Add To Shopping Cart'] ")
    public WebElement addToShoppingCartBtn;


    //    //span[text()='Add To Shopping Cart plus']      Sopping sepetine ekleme butonu
    @FindBy(xpath="//span[text()='plus'] ")
    public WebElement addToShoppingCartPlusBtn;


    //   //span[@class='flex pb-0.5']   //  Alisveris sepeti

    @FindBy(xpath="//span[@class='flex pb-0.5']")
    public WebElement shoppingBasketBtn;


    // //span[text()='Checkout']

    @FindBy(xpath="//span[text()='Checkout']")
    public WebElement checkOutBtn;

    //  Demo registration  page

    //    //input[@id='email']
    @FindBy(xpath="//input[@id='email']")
    public WebElement emailBtn;

    //   //input[@id='password']
    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordBtn;


    @FindBy(xpath="//button[text()='Login']")
    public WebElement loginBtn;



    //   //button[text()='Check Availability']

    @FindBy(xpath="//button[text()='Check Availability']")
    public WebElement checkAvailabilityBtn;

    //span[@class='text-base font-semibold text-heading']

    @FindBy(xpath="///span[@class='text-base font-semibold text-heading']")
    public WebElement totalBefore;

    //  //p[text()='Do you have coupon?']

    @FindBy(xpath="//p[text()='Do you have coupon?']")
    public WebElement doYouHaveCouponBtn;

    //input[@id='code']   //Paste the coupon

    @FindBy(xpath="//input[@id='code']")
    public WebElement pasteCouponBtn;



    //   //button[text()='Apply']

    @FindBy(xpath="//button[text()='Apply']")
    public WebElement applyBtn;

    //span[@class='text-base font-semibold text-heading']

    @FindBy(xpath="///span[@class='text-base font-semibold text-heading']")
    public WebElement totalAfter;





}