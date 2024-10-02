@tag
Feature: Placing the order
  
  Background:
  Given Launch the Browser

  @tag1
  Scenario: Adding items to cart
    Given Provided with Username and Password
  	When login to the website
  	Then add the items

 
