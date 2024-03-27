@all
Feature: Testing on NinjaDemo application

  Background: 
    Given Iam on tutorialsNinja Home page

   @login
  Scenario Outline: Test username and password for login page
    Then I click on my Account link
    When I click on my Login click
    Then I will be on  the Login page and I capture the title of the page
    And I enter Email id as '<EmailId>' on the page
    And I enter Password as '<Password>' on the page
    Then I Click on Login button

    Examples: 
      | EmailId         | Password |
      | admin@gmail.com |   123456 |

  @search
  Scenario: 
    Then I enter Input for the search box
    And I click on search button
    And I Close browser

  @addtocart
  Scenario: 
    And I click on Add to cart button
    And I Close browser
    
  Scenario:
		And I click on Checkout button
		And I Close browser

  @logout
  Scenario: 
    And I Close browser
