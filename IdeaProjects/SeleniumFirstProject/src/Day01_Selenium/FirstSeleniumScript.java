package Day01_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

    /*
2. Create main method.
3. System.setProperty("","");System.setProperty("webdriver.chrome.driver","/Users/Garry/Documents/seleniumdependencies/drivers/chromedriver");
3. (Windows) System.setProperty("webdriver.chrome.driver","C:\\Users\\Garry\\Documents\\seleniumdependencies\\drivers\\chromedriver.exe");
4. Chrome driver oluşturun.
WebDriver driver = new ChromeDriver();
5. ''https://www.google.com'’ adresinden google ana sayfasını açın.


     */

    public static void main(String[] args) {
        //1. adim Crome pathini belirledik
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");
        // 2. adim driver bjesini nolusturduk
        WebDriver driver=new ChromeDriver();

        //3. adim
        driver.get("https://www.google.com/");



    }

}
