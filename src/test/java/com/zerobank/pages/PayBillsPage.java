package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy (id = "sp_payee")
    public WebElement selectPayee;

    @FindBy (id = "sp_account")
    public WebElement selectAccount;

    @FindBy (id = "sp_amount")
    public WebElement amount;

    @FindBy (id = "sp_date")
    public WebElement date;

    @FindBy (id = "sp_description")
    public WebElement description;

    @FindBy (id = "pay_saved_payees")
    public WebElement payButton;

    @FindBy (xpath = "//span[.='The payment was successfully submitted.']")
    public WebElement alertMessage;




}
