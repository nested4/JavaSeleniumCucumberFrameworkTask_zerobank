package com.zerobank.stepDefinitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class PayBills_StepDefs {
    PayBillsPage payBillsPage = new PayBillsPage();

    @When("User selects the Payee {string}")
    public void user_selects_the_payee(String payee) {
        Select select = new Select(payBillsPage.selectPayee);
        select.selectByVisibleText(payee);
    }
    @When("User selects Account {string}")
    public void user_selects_account(String account) {
        Select select = new Select(payBillsPage.selectAccount);
        select.selectByIndex(Integer.parseInt(account));
    }

    @When("User enters payment amount {string}")
    public void user_enters_payment_amount(String amount) {
        payBillsPage.amount.sendKeys(amount);
    }
    @When("User enters date {string}")
    public void user_enters_date(String date) {
        payBillsPage.date.sendKeys(date);

    }
    @When("User enters description {string}")
    public void user_enters_description(String description) {
        payBillsPage.description.sendKeys(description);

    }
    @When("User clicks Pay Button")
    public void user_clicks_pay_button() {
        payBillsPage.payButton.click();
    }
    @Then("{string} alert message displayed")
    public void alert_message_displayed(String expectedAlertMessage) {
        String actualAlertMessage = payBillsPage.alertMessage.getText();
        Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
    }

    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String message) {

    }
}
