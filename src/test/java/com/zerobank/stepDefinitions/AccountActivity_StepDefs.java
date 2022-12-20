package com.zerobank.stepDefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivity_StepDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    @When("User should navigate to {string}")
    public void user_should_navigate_to(String accountType) {
        accountActivityPage.navigateToAccount(accountType);


    }

    @When("User should see the following options on Account Dropdown")
    public void user_should_see_the_following_accounts(List<String> expectedAccountOptions) {
        Select select = new Select(accountActivityPage.selectDropdown);
        List<WebElement> actualAccountOptions = select.getOptions();

        for (int i = 0; i < actualAccountOptions.size(); i++) {
            Assert.assertEquals(expectedAccountOptions.get(i),actualAccountOptions.get(i).getText());
        }
    }
    @When("User should see the following column names on Show Transactions table")
    public void user_should_see_the_following_options(List<String> expectedOptions) {
//      List<String>actualOptions= BrowserUtils.getElementsText(accountActivityPage.columnNames);
        List<String> actualOptions = new ArrayList<>();
        for (WebElement columnName : accountActivityPage.columnNames) {
            actualOptions.add(columnName.getText());
        }
        System.out.println("expectedOptions = " + expectedOptions);
        System.out.println("actualOptions1 = " + actualOptions);
        Assert.assertEquals(expectedOptions,actualOptions);
    }

    @And("User should see the {string} account as default on the accounts dropdown")
    public void userShouldSeeTheAccountAsDefaultOnTheAccountsDropdown(String expectedDefaultOption) {
        Select select = new Select(accountActivityPage.selectDropdown);
        String actualDefaultOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDefaultOption,actualDefaultOption);
    }
}
