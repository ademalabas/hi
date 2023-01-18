package test;



import org.testng.annotations.Test;
import pages.US_004_P.Pageee;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class Test02 extends TestBaseReports {

    @Test
    public void test02() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        this.extentTest = this.extentReports.createTest("PICKBAZAR TC-036-02");
        Pageee hp = new Pageee();
        hp.joinButton.click();
        // hp.emailButton.clear();
        // hp.emailButton.sendKeys(ConfigReader.getProperty("email"));

        // hp.passwordButton.clear();
        // hp.passwordButton.sendKeys(ConfigReader.getProperty("password"));
        Thread.sleep(3000);
        hp.loginButton.click();
        Thread.sleep(3000);
        hp.GroceryTab.click();
        // hp.clothing.click();
        // hp.productImage.click();
        //hp.color.click();
        // hp.size.click();
        //hp.addToShoppingCart.click();
        // Actions actions=new Actions(Driver.getDriver());
        //  actions.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).perform();
        // hp.ödeme.click();
    }}
