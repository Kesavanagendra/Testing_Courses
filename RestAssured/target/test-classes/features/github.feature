Feature: Test github APIs using Rest Assured

  Scenario: Get all the Github repos with authorization as Bearer Token
    Given Users enter github base URL and Authorization
    When User executes HTTP get method
    Then Validate the response status code.
