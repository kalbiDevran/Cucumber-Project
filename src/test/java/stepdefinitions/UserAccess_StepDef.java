package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

import java.time.Duration;

public class UserAccess_StepDef {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("user is navigated to Crater login page")
    public void user_is_navigated_to_crater_login_page() {
        //maximize window
        driver.manage().window().maximize();
        //navigate to the crater app login app
        driver.get("http://crater.primetech-apps.com/login");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
        loginPage.emailInput.sendKeys("entityadmin@primetechschool.com");
        loginPage.passwordInput.sendKeys("primetech@school");
    }

    @And("user click on login button")
    public void user_click_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
    }



    //Second Scenario: negative testcase, can not use duplicate method

    @When("user enters invalid username and valid password")
    public void user_enters_invalid_username_and_valid_password() {
    }

    @Then("user should see an error message {string} displayed")
    public void user_should_see_an_error_message_displayed(String string) {
    }

    @And("user should not be logged in")
    public void user_should_not_be_logged_in() {
    }

}

