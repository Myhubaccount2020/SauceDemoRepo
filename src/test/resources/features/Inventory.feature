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

