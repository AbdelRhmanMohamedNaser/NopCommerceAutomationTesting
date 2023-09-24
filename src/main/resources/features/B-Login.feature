Feature: Login page
Background:
  When user open browser and navigate to home page
  And press login button

  @regression
    #Happy Scenario
  Scenario: user can Login with valid data  and can logout
    And user enter his email "abdo2qa3a@gmail.com"
    Then user enter his password "password123"
    And User Select RememberMe Box
    Then Scroll Down
    Then User click login button
    Then user Logout
    Then close browser

  @regression
    #Negative Scenario
  Scenario: user can't Login with ivalid email
    And user enter his email "ahmed@gmail.com"
    Then user enter his password "password123"
    And User Select RememberMe Box
    Then Scroll Down
    Then User click login button
    Then user cant login
    Then close browser

  @regression
    #Negative Scenario
  Scenario: user can't Login with ivalid password
    And user enter his email "abdo23a@gmail.com"
    Then user enter his password "151515"
    And User Select RememberMe Box
    Then Scroll Down
    Then User click login button
    Then close browser

