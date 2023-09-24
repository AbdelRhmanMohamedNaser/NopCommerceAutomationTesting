Feature: Search
  Background:
    Given user open browser and navigate to home page of nopcommerce page

  @regression
     #Negative Scenario
  Scenario: user won't get result without type a product name
    When user type product name "      "
    And press search button
    And Scroll down to see products
  @regression

    #Negative Scenario
  Scenario: user won't get result if he type a product name that have number or special character
    When user type product name "computer$"
    And press search button
    And Scroll down to see products

     @regression
     #Happy Scenario
  Scenario: user can search for any product
    When user type product name "computer"
    And press search button
    And Scroll down to see products