Feature: Testing the checkout page


  Background:
    Given user is on the sauceDemo page
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the inventory page
    And user add to cart
    And user navigates to cart
    Then user should land on the cart page
    And the button CHECKOUT should be visible
    And user navigates to checkout page
    Then user should land on the checkout page


    Scenario: user should be able to cancel the checkout
      Given the button CANCEL should be visible
      And user cancel the checkout
      Then user should land on the cart page

      Scenario: user should be able to continue checkout
         And user enter "mourad","ikhlef","30101"
        Then user click on the button continue


        Scenario: user should not be able to continue checkout without first name,last name and zip code
          And user enter "mourad","ikhlef",""
          Then user click on the button continue
          Then user should see an error message