Feature: Account Summary Main Page

  Scenario: User should be able to see the account details
    Given User should be on the login page
    When User should input username "username" and password "password"
    And "Zero - Account Summary" title should be displayed
    Then User should see the following Account Types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then Credit Accounts table should have the following columns
      | Account     |
      | Credit Card |
      | Balance     |