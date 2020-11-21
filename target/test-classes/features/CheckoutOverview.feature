Feature:  Testing the checkout overview page

  Background:
    Given user is on the sauceDemo page
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the inventory page
    And  user add the product number "0" to cart
    And  user add the product number "3" to cart
    And user navigates to cart
    Then user should land on the cart page
    And the button CHECKOUT should be visible
    And user navigates to checkout page
    Then user should land on the checkout page
    And user enter "mourad","ikhlef","30101"
    Then user click on the button continue
    Then user should land on the checkout overview


    Scenario: user should be able to cancel checkout
      Given the button CANCEL should be visible from the checkout overview page
       And user click on the button cancel
      Then user should land on the inventory page


      Scenario: user should be able to finish the checkout
        Given the button FINISH should be visible
        And  verify the total price
        And user finish the checkout
        Then user should land on the complete checkout page
