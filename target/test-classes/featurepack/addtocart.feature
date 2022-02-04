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
@tag
Feature: Add to cart feature

  @tag1
  Scenario: Checking functionality of Add to cart feature
    Given user must be on homepage url "https://www.demoblaze.com/"
    And login with same username and password
    When Select one laptop under Laptops Option
    And Click on Add to Cart button
    Then An alert should be displayed 
    And Product is added to the Navigate to Cart page

  
