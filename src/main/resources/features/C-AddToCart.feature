Feature: Add product to Cart

    @regression
  Scenario: user can add a product to his cart
    Given user open browser and navigate to home page and login
    Then User choose a category
    Then user choose the next category
    Then user click add to cart on the product he want
    Then user go to see his shopping cart then close browser



