Feature: Test the functionality of Chilternoak Page

	Background:
		#Given User open the Chilternoak application
    When User click on Admin logo
    Then User click on Signup
    
	
  Scenario Outline: To test the SignUp functionality with valid data
  	When User enters data from "<Sheetname>" and <RowNumber>
    Then User click on create account
    
    Examples:
    |Sheetname|RowNumber|
		|sheet1		|0				|
		
		
		Scenario Outline: To test the SignUp functionality with Invalid data
		When User enters data from "<Sheetname>" and <RowNumber>
    Then User try to click on create account
    Examples:
    |Sheetname|RowNumber|
		|sheet1		|1				|
		|sheet1		|2				|