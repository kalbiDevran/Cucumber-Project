package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

     private Driver() {
//        // you can not create object
     }

    /**
     * Static method to get the single instance of WebDriver
     * @return
     */

    public static WebDriver getDriver(){
        System.out.println("Getting an instance of the driver");

        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver(); // Instantiate only once
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver; // this is an existing one that is not null (driver this is alive)
    }

    /**
     * This method will quit the driver and set it to null
     */
    public static void closeDriver(){
        //We check if the driver still alive then
        // quit the driver and set the driver object to null
        System.out.println("Closing the driver");
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
