Feature: testing the cart page

  Background:
    Given user is on the sauceDemo page
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the inventory page
    And user add to cart
    And user add to cart
    And user add to cart
    And user navigates to cart
    Then user should land on the cart page

    Scenario: user should be able to continue shopping
      And user navigates to continue shopping
      Then user should land on the inventory page


      Scenario: user should be able to remove a product from cart
        And the button REMOVE from cart page should be visible
        Then user remove from cart page
        Then user remove from cart page
        Then shopping cart number should be decremented