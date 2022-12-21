Feature: Pay Bills


  Background:
    Given User should be on the login page
    When User should input username "username" and password "password"
    And User should navigate to "Pay Bills"
    And "Zero - Pay Bills" title should be displayed
    And User selects the Payee "Apple"
    And User selects Account "3"

  Scenario: User should be able to make payments to saved payees from selected account
    And User enters payment amount "100"
    And User enters date "2022-12-30"
    And User enters description "iPad payment"
    And User clicks Pay Button
    Then "The payment was successfully submitted." alert message displayed

  @wip
  Scenario Outline: User should not be able to pay the bill without entering amount or date. And also user should not be able to
  pay the bill if  entering alphabetical or special characters for amount and alphabetical characters for the date
    When User enters payment amount "<Amount>"
    And  User enters date "<Date>"
    And User clicks Pay Button
    Then "Please fill out this field message!" message should be displayed
    Examples:
      | Amount | Date |
      |        |      |








