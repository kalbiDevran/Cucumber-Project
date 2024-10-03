package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserUtils {

    /**
     * this will refresh the page
     * @param driver
     */
    public static void refreshPage(WebDriver driver){
        driver.navigate().refresh();
    }
}
