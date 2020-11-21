Feature: testing the cart page

  Background:
    Given user is on the sauceDemo page
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the inventory page
    Then user add the product number "0" to cart
    Then user add the product number "1" to cart
    Then user add the product number "2" to cart
    And user navigates to cart
    Then user should land on the cart page

    Scenario: user should be able to continue shopping
      And the button continue shopping should be visible
      And user navigates to continue shopping
      Then user should land on the inventory page


      Scenario: user should be able to remove a product from cart
        And the button REMOVE from cart page should be visible
        Then user remove the product "2" from cart page
        Then shopping cart number should be decremented

        Scenario: user should be able to navigate to checkout page
          And the button CHECKOUT should be visible
          And user navigates to checkout page
          Then user should land on the checkout page