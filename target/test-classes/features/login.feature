Feature: Testing login functionality


  Scenario: user should be able to logon with valid credentials
   Given user is on the sauceDemo page
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the inventory page


    Scenario Outline: test all users
      Given user is on the sauceDemo page
      And user logs in with "<user>","<password>"
      Then user should land on the inventory page

      Examples:
      |user   |password|
      |standard_user    |secret_sauce|
      |problem_user      |secret_sauce|
      |performance_glitch_user  |secret_sauce|



      Scenario: user should not be able to login with invalid data
        Given user is on the sauceDemo page
        And user logs in with "locked_out_user ","secret_sauce"
        Then user should see the error button
