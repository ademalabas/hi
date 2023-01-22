package pages.US_022_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_022_1_P {
    public US_022_1_P(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Grocery'])[1]")
    public WebElement groceryButton;

    @FindBy(xpath = "//span[text()='Daily Needs']")
    public WebElement dailyNeedsButton;

    @FindBy(xpath = "//h3[text()='Vegetables']")
    public WebElement vegetablesButton;

    @FindBy(xpath = "//h3[text()='Allium']")
    public WebElement alliumButton;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='hidden product-cart lg:flex relative']")
    public WebElement sepetButton;

    @FindBy(xpath = "(//h3[text()='Fresh chopped chives 1lbs'])[2]")
    public WebElement sepettekiUrun;

}
