Feature: Test the functionality of Chilternoak Page

  Scenario: To test the SignUp functionality
    #Given User open the Chilternoak application
    When User click on Admin logo
    Then User click on Signup
    When User enters firstName lastName email password
    Then User click on create account
