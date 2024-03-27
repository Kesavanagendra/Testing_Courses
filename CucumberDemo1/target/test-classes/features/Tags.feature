@all
Feature: This is a Tags Demo

  @SmokeTest @DbTest
  Scenario: Search contact
    Given Desired contact will be displayed

	@RegressionTest
  Scenario: Search a deal
    Given Desired deal will be displayed

	@SmokeTest @FunctionTest
  Scenario: search an email
    Given Desired email will be displayed
    
  @DbTest
  Scenario: Search a photo
  	Given Desired photo will be dispayed
