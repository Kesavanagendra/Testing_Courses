@all
Feature: Tests the Star Health Page

  @FunctionTest
  Scenario: Star health home page test
    Given User open the Star Health Application
    Then validates the Star Health home page title using a JUnit assertion
    Then clicks on Buy now button
    And user enters following details
      | FullName | PhNo      | PIN  |
      | admin    | 123456789 | 1234 |
      | maya     | 987456321 | 9876 |
    And clicked on Star health logo
    Then User click on blog option

  @FunctionTest1
  Scenario: My family plan page test
    Given user open starHealth url and moves cursor to signin
    Then click on Retails customer option
    Then moves cursor to plans
    Then userclicks on My Family plan page
    And user provides following data
      | Name | Mobile    | Email          |
      | Raju | 123659874 | Raju@gmail.com |
      | Ram  | 254698732 | Ram@gmail.com  |
    Then user clicks on next button
    And user clicks on Star health logo
