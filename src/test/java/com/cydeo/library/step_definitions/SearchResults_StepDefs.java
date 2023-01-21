package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class SearchResults_StepDefs {

    BasePage basePage = new BasePage();
    UsersPage usersPage = new UsersPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @When("I navigate to {string} page")
    public void i_navigate_to_page(String pageName) {
        switch (pageName){
            case "dashboard":
                basePage.dashboardButton.click();
                break;
            case "users":
                basePage.usersButton.click();
                break;
            case "books":
                basePage.booksButton.click();
                break;
        }
    }


    @Then("Table should have following column names")
    public void table_should_have_following_column_names(List<String> expectedColumnNames) {
        wait.until(visibilityOf(usersPage.showRecordsDropdown));

        List<String> actualColumnNames = new ArrayList<>();

        for (WebElement eachTableHeader : usersPage.tableHeadersList) {
            actualColumnNames.add(eachTableHeader.getText());
        }

        assertEquals(expectedColumnNames,actualColumnNames);
    }



}
