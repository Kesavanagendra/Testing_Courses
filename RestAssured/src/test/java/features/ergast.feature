Feature: Test the functionality of Ergast API

  Scenario: Get the Ergast data
    Given User enters Ergast link
    When User executes the HTTP Get method
    Then User validate the response code
