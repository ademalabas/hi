package pages.US_007;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007_1 {

    public US_007_1(){
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

    //  //button[text()='Profile']

    @FindBy(xpath="//button[text()='Profile']")
    public WebElement profileBtn;

    //   //input[@id='name']
    @FindBy(xpath="//input[@id='name']")
    public WebElement nameInput;

    //   //textarea[@id='profile.bio']
    @FindBy(xpath="//textarea[@id='profile.bio']")
    public WebElement bioInput;

    //   //button[text()='Save']
    @FindBy(xpath="//button[text()='Save']")
    public WebElement saveBtn;

    //    Alert Mesaji icin
    @FindBy(xpath="")
    public WebElement alertMessage;





}
