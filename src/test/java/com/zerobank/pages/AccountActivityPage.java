package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{
    @FindBy (xpath = "//table//th")
    public List<WebElement> columnNames;

    @FindBy (id = "aa_accountId")
    public WebElement selectDropdown;

    public void navigateToAccount(String account){
        Driver.get().findElement(By.linkText(account)).click();
    }
}
