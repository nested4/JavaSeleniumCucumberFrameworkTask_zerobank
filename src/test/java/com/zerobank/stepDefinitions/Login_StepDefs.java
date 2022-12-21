package com.zerobank.stepDefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage=new LoginPage();
    @Given("User should be on the login page")
    public void user_should_be_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("User should input username {string} and password {string}")
    public void user_should_input_username_and_password(String username, String password) {
        loginPage.signinButton.click();
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.submitButton.click();
        Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");

    }
    @Then("{string} title should be displayed")
    public void page_should_be_displayed(String expectedTitle) {
        System.out.println(expectedTitle);


        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("User enters username {string} password {string}")
    public void user_enters_username_password(String username, String password) {
        loginPage.signinButton.click();
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.submitButton.click();

    }
    @Then("Error message {string} should be displayed")
    public void error_message_should_be_displayed(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }



}
