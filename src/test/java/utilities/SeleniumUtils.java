package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtils {

    /**
     * This method will select from a Dropdown using selectByValue from Selenium
     * @param element (the Select element with select tag from the html)
     * @param valueToBeSelected (the option value that we want to select)
     */
    public static void selectByValueFromDropDown(WebElement element, String valueToBeSelected){
        Select select = new Select(element);
        select.selectByValue(valueToBeSelected);
    }

    /**
     * This method will drag and drop an element from a source to target element using Action class of Selenium
     * @param driver (the driver object that was instantiated)
     * @param sourceElement (the source element that we want to drag)
     * @param targetElement (the target element that we want to the source element to)
     */
    public static void dragAndDrop(WebDriver driver, WebElement sourceElement, WebElement targetElement){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }

    
}
