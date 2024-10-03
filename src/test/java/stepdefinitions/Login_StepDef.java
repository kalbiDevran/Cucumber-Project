package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_StepDef {
    WebDriver driver;

    @Given("User is navigated to saucedemo.com")
    public void user_is_navigated_to_saucedemo_com() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @When("User enters {string} in the username field")
    public void user_enters_in_the_username_field(String usernameValue) {
        System.out.println("username is: " + usernameValue);
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys(usernameValue);
    }

    @And("User enters {string} in the password field")
    public void user_enters_in_the_password_field(String passValue) {
        System.out.println("password value is: " + passValue);
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys(passValue);
    }

    @And("User clicks on Login Button")
    public void user_clicks_on_login_button() {
        WebElement button = driver.findElement(By.xpath("//input[@id='login-button']"));
        button.click();
    }

    @Then("User is able to verify the {string} label is displayed")
    public void user_is_able_to_verify_the_label_is_displayed(String productLabel) {
        WebElement actualElement = driver.findElement(By.xpath("//span[text()='Products']")); //coming from UI
        String actualLabel = actualElement.getText();
        boolean isDisplayed = actualElement.isDisplayed();

//        if (productLabel.equals(productElement.getText())){
//            System.out.println("They are equal");
//        } else{
//            System.out.println("not equal");
//        }

        //Assertion --> a way for you to verify if expected value is equal to actual value
        Assert.assertEquals(productLabel, actualLabel);
        Assert.assertTrue(isDisplayed);
        driver.quit();
    }


//    @Given("User is navigated to saucedemo.com")
//    public void user_is_navigated_to_saucedemo_com() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User enters {string} in the username field")
//    public void user_enters_in_the_username_field(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User enters {string} in the password field")
//    public void user_enters_in_the_password_field(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("User is able to verify that the error message {string} is displayed")
//    public void user_is_able_to_verify_that_the_error_message_is_displayed(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
