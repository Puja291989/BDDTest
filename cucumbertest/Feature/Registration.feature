#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Feature 
Feature: Registration feature
  I want to use this feature file for register a user

  @Scenario
  Scenario: Registration page one
    Given I have a url
    And i want to open chrome browser with url
    When I enter username and password
      | tutorial1 |     tutorial1 | 
      | tutorial2 |   tutorial2 | 
    And i click on submit
    Then I validate the login page
    And close the broswe

 