#""" (Doc Strings)
## this is used when we have to write more than 2-3 lines of text in the feature file.
## instead of writting in a single line , you can write it in multiple lines

Feature: Email page Test

Scenario: New file for docString demo
When I reset my password on the email
Then I should receive an email with following content
"""
Hello Kesava,
	pls click on this to reset the password
Thanks
Admin Team
""" 