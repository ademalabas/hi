package pages.US_004_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Pageee {
    public Pageee() {
    PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//button[text()='Join']")
    public WebElement joinButton;
    @FindBy(xpath = "//button[starts-with(text(),'Login')]")
    public WebElement loginButton;
    @FindBy(xpath ="//span[text()='Grocery'])[1]")
    public WebElement GroceryTab;
}



