Feature: Register
  Background:
    Given user open browsers
    And user navigate to register page
    When user choose Gender

    @regressio
    #Happy Scenario
  Scenario: user register successfully with valid data
    And user enter "Abdelrhman" and "Mohamed"
    Then scrolldown
    Then choose DataofBirth
    Then user enter email "abdo2qsa3a@gmail.com"
    And user enter company name "ITI"
    Then user enter password "password123"
    And user confirm password "password123"
    Then click register button
    Then user successfuly register
    Then close chrome browser

  @regressio
     #Negative Scenario
  Scenario: user couldn't register with existing email
    And user enter "mohamed" and "ali"
    Then scrolldown
    Then choose DataofBirth
    Then user enter email "abdo2qsa3a@gmail.com"
    And user enter company name "ITI"
    Then user enter password "348734123"
    And user confirm password "348734123"
    Then click register button
    Then user couldn't register
    Then close chrome browser
  @regressio
     #Negative Scenario
  Scenario: user couldn't register if he let firstname field empty
    And user enter "" and "omar"
    Then scrolldown
    Then choose DataofBirth
    Then user enter email "abdo23aas34@gmail.com"
    And user enter company name "ITI"
    Then user enter password "348734123"
    And user confirm password "348734123"
    Then click register button
    Then user unsuccessfuly register
    Then close chrome browser














