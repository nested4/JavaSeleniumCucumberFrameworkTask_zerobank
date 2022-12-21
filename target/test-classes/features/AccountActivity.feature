Feature: Account Activity

  Scenario: User should be able to see the account activities

    Given User should be on the login page
    When User should input username "username" and password "password"
    And User should navigate to "Account Activity"
    And "Zero - Account Activity" title should be displayed
    And User should see the "Savings" account as default on the accounts dropdown
    And User should see the following options on Account Dropdown
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

    And User should see the following column names on Show Transactions table
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
