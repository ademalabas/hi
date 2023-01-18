package pages.US_007_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007_5_P {

    public US_007_5_P(){
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



    //   (//button[text()='Logout'])[1]
    @FindBy(xpath="(//button[text()='Logout'])[1]")
    public WebElement logOutBtn;



    //    Confirmation for logout as seeing login page
    //   (//p[text()='Login with your email & password'])[1]
    @FindBy(xpath="(//p[text()='Login with your email & password'])[1]")
    public WebElement loginPageMessage;





}
