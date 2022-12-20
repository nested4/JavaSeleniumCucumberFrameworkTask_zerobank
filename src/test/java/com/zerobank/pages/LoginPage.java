package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (id = "signin_button")
    public WebElement signinButton;

    @FindBy (id = "user_login")
    public WebElement username;

    @FindBy (id = "user_password")
    public WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;



}
