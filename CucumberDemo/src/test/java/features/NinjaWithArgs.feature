Feature: Enter login credentials on tutorialsNinja page

  Scenario Outline: Test username and password for login page
    Given Iam on tutorialsNinja Homepage
    Then I click on my account link
    When I click on my login click
    Then I will be on  the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<Password>' on the page
    Then I click on Login button
    
    Examples: 
    | 	EmailId 		| Password |
    |admin@gmail.com| 123456   |
