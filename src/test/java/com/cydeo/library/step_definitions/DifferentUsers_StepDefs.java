package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DifferentUsers_StepDefs {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("I login using a {string} and {string}")
    public void i_login_using_a_and(String email, String password) {
        loginPage.usernameInputBox.sendKeys(email);
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.signInButton.click();
    }


    @Then("{string} should be visible at the top")
    public void should_be_visible_at_the_top(String expectedUsername) {
        BrowserUtils.waitForVisibility(basePage.accountUsernameBox,5);

        String actualUsername = basePage.accountUsernameBox.getText();

        assertEquals(expectedUsername,actualUsername);


    }



}
