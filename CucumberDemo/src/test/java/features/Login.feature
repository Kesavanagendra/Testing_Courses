# This is my first cucumber project
Feature: Testing rediff myPage

  Background: 
    Given I open the browser and enter url
    Then I capture the title of the page
    Then I enter username and password
    When I click on login button

	@register
  Scenario: User has to test if login on rediff is successful or not
    Then I should see an Error message
    Then I click on click here link
    And I close the browser

  Scenario: 
    Then I click on create a Rediffmail account
    Then I capture the title of the page
    And I close the browser
