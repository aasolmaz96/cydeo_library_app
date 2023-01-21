package com.cydeo.library.pages;

import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //Constructor
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //WebElements
    @FindBy(id = "inputEmail")
    public WebElement usernameInputBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;


    //Methods
    public boolean isAt(){
        return BrowserUtils.checkVisibilityOfElement(signInButton, 5);
    }


}
