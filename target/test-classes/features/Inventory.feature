Feature: Test Inventory page

 Background:
   Given user is on the sauceDemo page
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the inventory page

   Scenario: Test the navigation menu
     And the navigation menu should be visible
     Then user opens the menu
     And user navigates to "All Items"
     Then all the products should be visible

  Scenario Outline: Test the navigation menu
    And the navigation menu should be visible
    Then user opens the menu
    And user navigates to "<link>"

    Examples:
    |link|
    |All Items|
    |About    |
    |Reset App State|
    |Logout|

    Scenario: Test sorting products
      And sort by "Price (low to high)"
      Then the first listed product should be "Sauce Labs Onesie"
      And sort by "Name (A to Z)"
      Then the first listed product should be "Sauce Labs Backpack"


  Scenario: Test cart
    And user navigates to cart
    Then user should land on the cart page

    Scenario: Test the ADD TO CART and the REMOVE button
      And  The button ADD TO CART should be visible for each product
      Then user add to cart
      Then user add to cart
     Then shopping cart number should be incremented
       And the button REMOVE should be visible
       Then user remove from cart
       Then shopping cart number should be decremented