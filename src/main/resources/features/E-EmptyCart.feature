Feature: Make sure the cart is empty
  @regression
  Scenario Outline: User can remove a product to his cart
    Given user open browser
    And login to nopcommerce by Email is <email> and pass <password>
    When navigate to cart
    Then check cart is empty or not
    Examples:
      | email          | password |
      | "aa@gmail.com" | "asd23@" |
