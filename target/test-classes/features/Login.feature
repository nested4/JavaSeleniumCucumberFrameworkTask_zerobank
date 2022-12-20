Feature:


  Background:
    Given User should be on the login page

  Scenario: User should be able to login with valid credentials
    When User should input username "username" and password "password"
    Then "Zero - Account Summary" title should be displayed

  Scenario Outline: User should not able to login with invalid credentials

    When User enters username "<usernameInput>" password "<passwordInput>"
    Then Error message "Login and/or password are wrong." should be displayed
    Examples:
      | usernameInput | passwordInput  |
      | username      | Wrong_password |
      |               | passwordInput  |
      |               |                |
      | usernameInput |                |

