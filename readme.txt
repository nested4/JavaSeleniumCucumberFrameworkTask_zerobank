Description
In this assignment you will create an automated testing framework for testing Zero online banking application. The framework will use Cucumber BDD and Selenium.

Project Set Up
Create a maven project. Use group-id com.zerobank and artifact-id zerobankautomation. Add all the required dependencies for Cucumber and Selenium to the pom file.
Also add required plugins for HTML reporting with cucumber.

Under src/test/java create following packages:
com.zerobank.pages
com.zerobank.runners
com.zerobank.stepdefinitions
com.zerobank.utilities

Under src/test create following directory resources. Mark the new resources directory as a test resource folder.
Under the src/test/resources create new folder features.
Under the project folder add file configuration.properties.
Under utilities package create ConfigurationReader which reads from the properties file.
Under utilities package create Driver utility which can create a new web driver object based on value from configuration.properties.
Under utilities package create BrowserUtils based on the example shown in the class. You can more methods to this utility as you see fit.
Under runner package create CukesRunner based on the example shown in the class. In this class you can use any CucumberOptions as you see fit.


Write feature files
Write feature files based on the following requirements. Create one feature file per requirement. Each feature file can have multiple requirements.

Login:
Only authorized users should be able to login to the application. When user logs in with valid credentials, Account summary page should be displayed.
Users with wrong username or wrong password should not be able to login. Users with blank username or password should also not be able to login.
When user tries to login with invalid information, error message Login and/or password are wrong. should be displayed.

Account summary:
Account summary page should have the title Zero – Account summary. Account summary page should have to following account types:
Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts. Credit Accounts table must have columns Account, Credit Card and Balance.

Account Activity:
Account Activity page should have the title Zero – Account activity. In the Account drop down default option should be Savings.
Account drop down should have the following options: Savings, Checking, Loan, Credit Card, Brokerage. Transactions table should have column names
Date, Description, Deposit, Withdrawal.

Pay Bills:
Account Activity page should have the title Zero – Pay Bills. When user completes a successful Pay operation, The payment was successfully submitted.
should be displayed. When user tries to make a payment without entering the amount or date, Please fill out this field message!
should be displayed. Amount field should not accept alphabetical or special characters. Date field should not accept alphabetical characters.

NOTE: . For the date input field you can just use sendKeys. No need to click on the date navigator.