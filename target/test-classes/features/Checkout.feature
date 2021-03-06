Feature: Testing the checkout page


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


    Scenario: user should be able to cancel the checkout
      Given the button CANCEL should be visible
      And user cancel the checkout
      Then user should land on the cart page


      Scenario: user should be able to continue checkout
         And user enter "mourad","ikhlef","30101"
        Then user click on the button continue
        Then user should land on the checkout overview


  Scenario Outline: user should not be able to continue checkout without first name,last name and zip code
    And user enter "<firstname>","<lastname>","<zipcode>"
    Then user click on the button continue
    Then user should see an error message

    Examples:
      | firstname | lastname | zipcode |
      |       | ikhlef | 30101 |
      |mourad |        | 30101 |
      |mourad | ikhlef |       |


