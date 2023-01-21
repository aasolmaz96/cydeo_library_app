package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    //Constructor
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //WebElements
    @FindBy(xpath = "//span[.= 'Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//span[.= 'Users']")
    public WebElement usersButton;

    @FindBy(xpath = "//span[.= 'Books']")
    public WebElement booksButton;

    @FindBy(xpath = "//a[@data-toggle='dropdown']/span")
    public WebElement accountUsernameBox;


}
