package com.zerobank.stepDefinitions;

import com.zerobank.pages.AccountsSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefs {

    AccountsSummaryPage accountsSummaryPage = new AccountsSummaryPage();

    @Then("User should see the following Account Types")
    public void user_should_see_the_following_account_types(List<String> expectedAccountTypes) {
        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountsSummaryPage.accountTypes);

        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);

    }
    @Then("Credit Accounts table should have the following columns")
    public void credit_accounts_table_should_have_the_following_columns(List<String> expectedColumns) {
        List<String> actual_Columns = BrowserUtils.getElementsText(accountsSummaryPage.accountColumns);

        Assert.assertEquals(expectedColumns,actual_Columns);
    }
}
