package Day01_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    /*
    Invoke Chrome Browser
Navigate to URL: https://clarusway.com/
Navigate to URL: http://amazon.com/
Come back to the Clarusway using the back command.
Again go back to the amazon website using forward command
Refresh the Browser using refresh command.
Close the Browser.

     */
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

    }

}
