package pages.US_007;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007_3 {

    public US_007_3(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //   //button[text()='Join']
    @FindBy(xpath="//button[text()='Join']")
    public WebElement joinBtn;


    //  Demo registration  page

    //    //input[@id='email']
    @FindBy(xpath="//input[@id='email']")
    public WebElement emailBtn;

    //   //input[@id='password']
    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordBtn;


    @FindBy(xpath="//button[text()='Login']")
    public WebElement loginBtn;

    //   //span[text()='user avatar']

    @FindBy(xpath="//span[text()='user avatar']")
    public WebElement avatarBtn;


    //   //button[text()='My Orders']
    @FindBy(xpath="//button[text()='My Orders']")
    public WebElement myOrdersBtn;



    //   //span[text()='Order Pending']
    @FindBy(xpath="//span[text()='Order Pending']")
    public WebElement orderPendingBtn;






}