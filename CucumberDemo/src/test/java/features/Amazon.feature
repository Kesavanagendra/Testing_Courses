@all
Feature: Test the Amazon page on Chrome browser

  @login
  Scenario Outline: Test Login on Amazon
    Given user click on signin link
    Then user Enters username as '<username>'
    And user Enters password as '<password>'
    Then user click on login

    Examples: 
      | username         | password |
      | Kesava@gmail.com |   123456 |

  @function
  Scenario: Test add to cart the product on Amazon
    Given user clicks on mobile
    Then user moves cursor to mobiles&Accessories
    Then click on Apple link
    Then select the mobile
    And click on add to cart button
