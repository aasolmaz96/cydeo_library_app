package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        assertTrue(loginPage.isAt());
    }


    @When("I login as a {string}")
    public void i_login_as_a(String userType) {
        switch (userType){
            case "student":
                loginPage.usernameInputBox.sendKeys(ConfigReader.read("student46un"));
                loginPage.passwordInputBox.sendKeys(ConfigReader.read("student46pw"));
                BrowserUtils.sleep(1);
                loginPage.signInButton.click();
                break;
            case "librarian":
                loginPage.usernameInputBox.sendKeys(ConfigReader.read("librarian46un"));
                loginPage.passwordInputBox.sendKeys(ConfigReader.read("librarian46pw"));
                BrowserUtils.sleep(1);
                loginPage.signInButton.click();
                break;
        }
    }


    @Then("Dashboard should be displayed in the url")
    public void dashboard_should_be_displayed() {
        String expectedInUrl = "dashboard";

        wait.until(urlContains(expectedInUrl));
        String actualUrl = Driver.getDriver().getCurrentUrl();

        assertTrue(actualUrl.contains(expectedInUrl));
    }


    @Then("Books should be displayed in the url")
    public void books_should_be_displayed() {
        String expectedInUrl = "books";

        wait.until(urlContains(expectedInUrl));
        String actualUrl = Driver.getDriver().getCurrentUrl();

        assertTrue(actualUrl.contains(expectedInUrl));
    }


    @When("I enter username {string}")
    public void i_enter_username(String username) {
        loginPage.usernameInputBox.sendKeys(username);
    }


    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.passwordInputBox.sendKeys(password);
    }


    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
    }


    @When("Click the login button")
    public void click_the_login_button() {
        loginPage.signInButton.click();
    }


}
